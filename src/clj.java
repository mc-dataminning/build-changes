import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class clj {
   public static final Codec<clj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jy.i.q().fieldOf("id").forGetter(clj::d),
               Codec.INT.fieldOf("Count").forGetter(clj::L),
               rz.a.optionalFieldOf("tag").forGetter($$0x -> Optional.ofNullable($$0x.v()))
            )
            .apply($$0, clj::new)
   );
   private static final Logger j = LogUtils.getLogger();
   public static final clj b = new clj((Void)null);
   public static final DecimalFormat c = ac.a(new DecimalFormat("#.##"), $$0 -> $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));
   public static final String d = "Enchantments";
   public static final String e = "display";
   public static final String f = "Name";
   public static final String g = "Lore";
   public static final String h = "Damage";
   public static final String i = "color";
   private static final String k = "Unbreakable";
   private static final String l = "RepairCost";
   private static final String m = "CanDestroy";
   private static final String n = "CanPlaceOn";
   private static final String o = "HideFlags";
   private static final ur p = ur.c("item.disabled").a(n.m);
   private static final int q = 0;
   private static final vo r = vo.a.a(n.f).b(true);
   private int s;
   private int t;
   @Deprecated
   @Nullable
   private final cle u;
   @Nullable
   private rz v;
   @Nullable
   private bkq w;
   @Nullable
   private cir x;
   @Nullable
   private cir y;

   public Optional<cip> a() {
      return this.d().h(this);
   }

   public clj(crz $$0) {
      this($$0, 1);
   }

   public clj(ib<cle> $$0) {
      this($$0.a(), 1);
   }

   private clj(crz $$0, int $$1, Optional<rz> $$2) {
      this($$0, $$1);
      $$2.ifPresent(this::c);
   }

   public clj(ib<cle> $$0, int $$1) {
      this($$0.a(), $$1);
   }

   public clj(crz $$0, int $$1) {
      this.u = $$0.k();
      this.s = $$1;
      if (this.u.o()) {
         this.b(this.k());
      }
   }

   private clj(@Nullable Void $$0) {
      this.u = null;
   }

   private clj(rz $$0) {
      this.u = jy.i.a(new agi($$0.l("id")));
      this.s = $$0.f("Count");
      if ($$0.b("tag", 10)) {
         this.v = $$0.p("tag");
         this.d().b(this.v);
      }

      if (this.d().o()) {
         this.b(this.k());
      }
   }

   public static clj a(rz $$0) {
      try {
         return new clj($$0);
      } catch (RuntimeException var2) {
         j.debug("Tried to load invalid item: {}", $$0, var2);
         return b;
      }
   }

   public boolean b() {
      return this == b || this.u == clm.a || this.s <= 0;
   }

   public boolean a(cgd $$0) {
      return this.b() || this.d().a($$0);
   }

   public clj a(int $$0) {
      int $$1 = Math.min($$0, this.L());
      clj $$2 = this.c($$1);
      this.h($$1);
      return $$2;
   }

   public clj c() {
      if (this.b()) {
         return b;
      } else {
         clj $$0 = this.p();
         this.f(0);
         return $$0;
      }
   }

   public cle d() {
      return this.b() ? clm.a : this.u;
   }

   public ib<cle> e() {
      return this.d().j();
   }

   public boolean a(arv<cle> $$0) {
      return this.d().j().a($$0);
   }

   public boolean a(cle $$0) {
      return this.d() == $$0;
   }

   public boolean a(Predicate<ib<cle>> $$0) {
      return $$0.test(this.d().j());
   }

   public boolean a(ib<cle> $$0) {
      return this.d().j() == $$0;
   }

   public boolean a(ig<cle> $$0) {
      return $$0.a(this.e());
   }

   public Stream<arv<cle>> f() {
      return this.d().j().c();
   }

   public bix a(cnt $$0) {
      cdu $$1 = $$0.o();
      ht $$2 = $$0.a();
      dhm $$3 = new dhm($$0.q(), $$2, false);
      if ($$1 != null && !$$1.fU().e && !this.a($$0.q().H_().d(jz.e), $$3)) {
         return bix.d;
      } else {
         cle $$4 = this.d();
         bix $$5 = $$4.a($$0);
         if ($$1 != null && $$5.c()) {
            $$1.b(arb.c.b($$4));
         }

         return $$5;
      }
   }

   public float a(dhi $$0) {
      return this.d().a(this, $$0);
   }

   public biy<clj> a(csa $$0, cdu $$1, biw $$2) {
      return this.d().a($$0, $$1, $$2);
   }

   public clj a(csa $$0, blg $$1) {
      return this.d().a(this, $$0, $$1);
   }

   public rz b(rz $$0) {
      agi $$1 = jy.i.b(this.d());
      $$0.a("id", $$1 == null ? "minecraft:air" : $$1.toString());
      $$0.a("Count", (byte)this.s);
      if (this.v != null) {
         $$0.a("tag", this.v.h());
      }

      return $$0;
   }

   public int g() {
      return this.d().l();
   }

   public boolean h() {
      return this.g() > 1 && (!this.i() || !this.j());
   }

   public boolean i() {
      if (!this.b() && this.d().n() > 0) {
         rz $$0 = this.v();
         return $$0 == null || !$$0.q("Unbreakable");
      } else {
         return false;
      }
   }

   public boolean j() {
      return this.i() && this.k() > 0;
   }

   public int k() {
      return this.v == null ? 0 : this.v.h("Damage");
   }

   public void b(int $$0) {
      this.w().a("Damage", Math.max(0, $$0));
   }

   public int l() {
      return this.d().n();
   }

   public boolean a(int $$0, ats $$1, @Nullable amf $$2) {
      if (!this.i()) {
         return false;
      } else {
         if ($$0 > 0) {
            int $$3 = cpw.a(cpy.w, this);
            int $$4 = 0;

            for (int $$5 = 0; $$3 > 0 && $$5 < $$0; $$5++) {
               if (cps.a(this, $$3, $$1)) {
                  $$4++;
               }
            }

            $$0 -= $$4;
            if ($$0 <= 0) {
               return false;
            }
         }

         if ($$2 != null && $$0 != 0) {
            al.t.a($$2, this, this.k() + $$0);
         }

         int $$6 = this.k() + $$0;
         this.b($$6);
         return $$6 >= this.l();
      }
   }

   public <T extends blg> void a(int $$0, T $$1, Consumer<T> $$2) {
      if (!$$1.dN().B && (!($$1 instanceof cdu) || !((cdu)$$1).fU().d)) {
         if (this.i()) {
            if (this.a($$0, $$1.eh(), $$1 instanceof amf ? (amf)$$1 : null)) {
               $$2.accept($$1);
               cle $$3 = this.d();
               this.h(1);
               if ($$1 instanceof cdu) {
                  ((cdu)$$1).b(arb.d.b($$3));
               }

               this.b(0);
            }
         }
      }
   }

   public boolean m() {
      return this.d().e(this);
   }

   public int n() {
      return this.d().f(this);
   }

   public int o() {
      return this.d().g(this);
   }

   public boolean a(cih $$0, cgu $$1, cdu $$2) {
      return this.d().a(this, $$0, $$1, $$2);
   }

   public boolean a(clj $$0, cih $$1, cgu $$2, cdu $$3, bly $$4) {
      return this.d().a(this, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(blg $$0, cdu $$1) {
      cle $$2 = this.d();
      if ($$2.a(this, $$0, $$1)) {
         $$1.b(arb.c.b($$2));
      }
   }

   public void a(csa $$0, dhi $$1, ht $$2, cdu $$3) {
      cle $$4 = this.d();
      if ($$4.a(this, $$0, $$1, $$2, $$3)) {
         $$3.b(arb.c.b($$4));
      }
   }

   public boolean b(dhi $$0) {
      return this.d().a_($$0);
   }

   public bix a(cdu $$0, blg $$1, biw $$2) {
      return this.d().a(this, $$0, $$1, $$2);
   }

   public clj p() {
      if (this.b()) {
         return b;
      } else {
         clj $$0 = new clj(this.d(), this.s);
         $$0.e(this.K());
         if (this.v != null) {
            $$0.v = this.v.h();
         }

         return $$0;
      }
   }

   public clj c(int $$0) {
      if (this.b()) {
         return b;
      } else {
         clj $$1 = this.p();
         $$1.f($$0);
         return $$1;
      }
   }

   public static boolean a(clj $$0, clj $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return $$0.L() != $$1.L() ? false : c($$0, $$1);
      }
   }

   public static boolean b(clj $$0, clj $$1) {
      return $$0.a($$1.d());
   }

   public static boolean c(clj $$0, clj $$1) {
      if (!$$0.a($$1.d())) {
         return false;
      } else {
         return $$0.b() && $$1.b() ? true : Objects.equals($$0.v, $$1.v);
      }
   }

   public String q() {
      return this.d().j(this);
   }

   @Override
   public String toString() {
      return this.L() + " " + this.d();
   }

   public void a(csa $$0, bkq $$1, int $$2, boolean $$3) {
      if (this.t > 0) {
         this.t--;
      }

      if (this.d() != null) {
         this.d().a(this, $$0, $$1, $$2, $$3);
      }
   }

   public void a(csa $$0, cdu $$1, int $$2) {
      $$1.a(arb.b.b(this.d()), $$2);
      this.d().b(this, $$0, $$1);
   }

   public void a(csa $$0) {
      this.d().a(this, $$0);
   }

   public int r() {
      return this.d().b(this);
   }

   public cnc s() {
      return this.d().c(this);
   }

   public void a(csa $$0, blg $$1, int $$2) {
      this.d().a(this, $$0, $$1, $$2);
   }

   public boolean t() {
      return this.d().l(this);
   }

   public boolean u() {
      return !this.b() && this.v != null && !this.v.g();
   }

   @Nullable
   public rz v() {
      return this.v;
   }

   public rz w() {
      if (this.v == null) {
         this.c(new rz());
      }

      return this.v;
   }

   public rz a(String $$0) {
      if (this.v != null && this.v.b($$0, 10)) {
         return this.v.p($$0);
      } else {
         rz $$1 = new rz();
         this.a($$0, $$1);
         return $$1;
      }
   }

   @Nullable
   public rz b(String $$0) {
      return this.v != null && this.v.b($$0, 10) ? this.v.p($$0) : null;
   }

   public void c(String $$0) {
      if (this.v != null && this.v.e($$0)) {
         this.v.r($$0);
         if (this.v.g()) {
            this.v = null;
         }
      }
   }

   public sf x() {
      return this.v != null ? this.v.c("Enchantments", 10) : new sf();
   }

   public void c(@Nullable rz $$0) {
      this.v = $$0;
      if (this.d().o()) {
         this.b(this.k());
      }

      if ($$0 != null) {
         this.d().b($$0);
      }
   }

   public ur y() {
      rz $$0 = this.b("display");
      if ($$0 != null && $$0.b("Name", 8)) {
         try {
            ur $$1 = ur.a.a($$0.l("Name"));
            if ($$1 != null) {
               return $$1;
            }

            $$0.r("Name");
         } catch (Exception var3) {
            $$0.r("Name");
         }
      }

      return this.d().m(this);
   }

   public clj a(@Nullable ur $$0) {
      rz $$1 = this.a("display");
      if ($$0 != null) {
         $$1.a("Name", ur.a.a($$0));
      } else {
         $$1.r("Name");
      }

      return this;
   }

   public void z() {
      rz $$0 = this.b("display");
      if ($$0 != null) {
         $$0.r("Name");
         if ($$0.g()) {
            this.c("display");
         }
      }

      if (this.v != null && this.v.g()) {
         this.v = null;
      }
   }

   public boolean A() {
      rz $$0 = this.b("display");
      return $$0 != null && $$0.b("Name", 8);
   }

   public List<ur> a(@Nullable cdu $$0, cna $$1) {
      List<ur> $$2 = Lists.newArrayList();
      vf $$3 = ur.i().b(this.y()).a(this.C().e);
      if (this.A()) {
         $$3.a(n.u);
      }

      $$2.add($$3);
      if (!$$1.a() && !this.A() && this.a(clm.rR)) {
         Integer $$4 = clq.d(this);
         if ($$4 != null) {
            $$2.add(clq.k(this));
         }
      }

      int $$5 = this.P();
      if (a($$5, clj.a.f)) {
         this.d().a(this, $$0 == null ? null : $$0.dN(), $$2, $$1);
      }

      if (this.u()) {
         if (a($$5, clj.a.h) && $$0 != null) {
            cnl.a(this, $$0.dN().H_(), $$2);
         }

         if (a($$5, clj.a.a)) {
            a($$2, this.x());
         }

         if (this.v.b("display", 10)) {
            rz $$6 = this.v.p("display");
            if (a($$5, clj.a.g) && $$6.b("color", 99)) {
               if ($$1.a()) {
                  $$2.add(ur.a("item.color", String.format(Locale.ROOT, "#%06X", $$6.h("color"))).a(n.h));
               } else {
                  $$2.add(ur.c("item.dyed").a(n.h, n.u));
               }
            }

            if ($$6.d("Lore") == 9) {
               sf $$7 = $$6.c("Lore", 8);

               for (int $$8 = 0; $$8 < $$7.size(); $$8++) {
                  String $$9 = $$7.j($$8);

                  try {
                     vf $$10 = ur.a.a($$9);
                     if ($$10 != null) {
                        $$2.add(uu.a($$10, r));
                     }
                  } catch (Exception var19) {
                     $$6.r("Lore");
                  }
               }
            }
         }
      }

      if (a($$5, clj.a.b)) {
         for (bkv $$12 : bkv.values()) {
            Multimap<bmh, bmk> $$13 = this.a($$12);
            if (!$$13.isEmpty()) {
               $$2.add(uq.a);
               $$2.add(ur.c("item.modifiers." + $$12.e()).a(n.h));

               for (Entry<bmh, bmk> $$14 : $$13.entries()) {
                  bmk $$15 = $$14.getValue();
                  double $$16 = $$15.c();
                  boolean $$17 = false;
                  if ($$0 != null) {
                     if ($$15.a() == cle.m) {
                        $$16 += $$0.c(bmm.c);
                        $$16 += (double)cpw.a(this, bll.a);
                        $$17 = true;
                     } else if ($$15.a() == cle.n) {
                        $$16 += $$0.c(bmm.e);
                        $$17 = true;
                     }
                  }

                  double $$18;
                  if ($$15.b() == bmk.a.b || $$15.b() == bmk.a.c) {
                     $$18 = $$16 * 100.0;
                  } else if ($$14.getKey().equals(bmm.i)) {
                     $$18 = $$16 * 10.0;
                  } else {
                     $$18 = $$16;
                  }

                  if ($$17) {
                     $$2.add(uq.a().b(ur.a("attribute.modifier.equals." + $$15.b().a(), c.format($$18), ur.c($$14.getKey().c()))).a(n.c));
                  } else if ($$16 > 0.0) {
                     $$2.add(ur.a("attribute.modifier.plus." + $$15.b().a(), c.format($$18), ur.c($$14.getKey().c())).a(n.j));
                  } else if ($$16 < 0.0) {
                     $$18 *= -1.0;
                     $$2.add(ur.a("attribute.modifier.take." + $$15.b().a(), c.format($$18), ur.c($$14.getKey().c())).a(n.m));
                  }
               }
            }
         }
      }

      if (this.u()) {
         if (a($$5, clj.a.c) && this.v.q("Unbreakable")) {
            $$2.add(ur.c("item.unbreakable").a(n.j));
         }

         if (a($$5, clj.a.d) && this.v.b("CanDestroy", 9)) {
            sf $$21 = this.v.c("CanDestroy", 8);
            if (!$$21.isEmpty()) {
               $$2.add(uq.a);
               $$2.add(ur.c("item.canBreak").a(n.h));

               for (int $$22 = 0; $$22 < $$21.size(); $$22++) {
                  $$2.addAll(d($$21.j($$22)));
               }
            }
         }

         if (a($$5, clj.a.e) && this.v.b("CanPlaceOn", 9)) {
            sf $$23 = this.v.c("CanPlaceOn", 8);
            if (!$$23.isEmpty()) {
               $$2.add(uq.a);
               $$2.add(ur.c("item.canPlace").a(n.h));

               for (int $$24 = 0; $$24 < $$23.size(); $$24++) {
                  $$2.addAll(d($$23.j($$24)));
               }
            }
         }
      }

      if ($$1.a()) {
         if (this.j()) {
            $$2.add(ur.a("item.durability", this.l() - this.k(), this.l()));
         }

         $$2.add(ur.b(jy.i.b(this.d()).toString()).a(n.i));
         if (this.u()) {
            $$2.add(ur.a("item.nbt_tags", this.v.e().size()).a(n.i));
         }
      }

      if ($$0 != null && !this.d().a($$0.dN().H())) {
         $$2.add(p);
      }

      return $$2;
   }

   private static boolean a(int $$0, clj.a $$1) {
      return ($$0 & $$1.a()) == 0;
   }

   private int P() {
      return this.u() && this.v.b("HideFlags", 99) ? this.v.h("HideFlags") : 0;
   }

   public void a(clj.a $$0) {
      rz $$1 = this.w();
      $$1.a("HideFlags", $$1.h("HideFlags") | $$0.a());
   }

   public static void a(List<ur> $$0, sf $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         rz $$3 = $$1.a($$2);
         jy.g.b(cpw.b($$3)).ifPresent($$2x -> $$0.add($$2x.d(cpw.a($$3))));
      }
   }

   private static Collection<ur> d(String $$0) {
      try {
         return (Collection<ur>)fk.b(jy.f.p(), $$0, true)
            .map(
               $$0x -> Lists.newArrayList(new ur[]{$$0x.a().b().f().a(n.i)}),
               $$0x -> $$0x.a().a().map($$0xx -> ((cva)$$0xx.a()).f().a(n.i)).collect(Collectors.toList())
            );
      } catch (CommandSyntaxException var2) {
         return Lists.newArrayList(new ur[]{ur.b("missingno").a(n.i)});
      }
   }

   public boolean B() {
      return this.d().i(this);
   }

   public cma C() {
      return this.d().n(this);
   }

   public boolean D() {
      return !this.d().d_(this) ? false : !this.E();
   }

   public void a(cpu $$0, int $$1) {
      this.w();
      if (!this.v.b("Enchantments", 9)) {
         this.v.a("Enchantments", new sf());
      }

      sf $$2 = this.v.c("Enchantments", 10);
      $$2.add(cpw.a(cpw.a($$0), (byte)$$1));
   }

   public boolean E() {
      return this.v != null && this.v.b("Enchantments", 9) ? !this.v.c("Enchantments", 10).isEmpty() : false;
   }

   public void a(String $$0, sw $$1) {
      this.w().a($$0, $$1);
   }

   public boolean F() {
      return this.w instanceof cag;
   }

   public void a(@Nullable bkq $$0) {
      this.w = $$0;
   }

   @Nullable
   public cag G() {
      return this.w instanceof cag ? (cag)this.H() : null;
   }

   @Nullable
   public bkq H() {
      return !this.b() ? this.w : null;
   }

   public int I() {
      return this.u() && this.v.b("RepairCost", 3) ? this.v.h("RepairCost") : 0;
   }

   public void d(int $$0) {
      if ($$0 > 0) {
         this.w().a("RepairCost", $$0);
      } else {
         this.c("RepairCost");
      }
   }

   public Multimap<bmh, bmk> a(bkv $$0) {
      Multimap<bmh, bmk> $$1;
      if (this.u() && this.v.b("AttributeModifiers", 9)) {
         $$1 = HashMultimap.create();
         sf $$2 = this.v.c("AttributeModifiers", 10);

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            rz $$4 = $$2.a($$3);
            if (!$$4.b("Slot", 8) || $$4.l("Slot").equals($$0.e())) {
               Optional<bmh> $$5 = jy.v.b(agi.a($$4.l("AttributeName")));
               if (!$$5.isEmpty()) {
                  bmk $$6 = bmk.a($$4);
                  if ($$6 != null && $$6.a().getLeastSignificantBits() != 0L && $$6.a().getMostSignificantBits() != 0L) {
                     $$1.put($$5.get(), $$6);
                  }
               }
            }
         }
      } else {
         $$1 = this.d().a($$0);
      }

      return $$1;
   }

   public void a(bmh $$0, bmk $$1, @Nullable bkv $$2) {
      this.w();
      if (!this.v.b("AttributeModifiers", 9)) {
         this.v.a("AttributeModifiers", new sf());
      }

      sf $$3 = this.v.c("AttributeModifiers", 10);
      rz $$4 = $$1.d();
      $$4.a("AttributeName", jy.v.b($$0).toString());
      if ($$2 != null) {
         $$4.a("Slot", $$2.e());
      }

      $$3.add($$4);
   }

   public ur J() {
      vf $$0 = ur.i().b(this.y());
      if (this.A()) {
         $$0.a(n.u);
      }

      vf $$1 = uu.a((ur)$$0);
      if (!this.b()) {
         $$1.a(this.C().e).a($$0x -> $$0x.a(new ux(ux.a.b, new ux.c(this))));
      }

      return $$1;
   }

   public boolean a(io<cva> $$0, dhm $$1) {
      if (this.y == null) {
         this.y = new cir("CanPlaceOn");
      }

      return this.y.a(this, $$0, $$1);
   }

   public boolean b(io<cva> $$0, dhm $$1) {
      if (this.x == null) {
         this.x = new cir("CanDestroy");
      }

      return this.x.a(this, $$0, $$1);
   }

   public int K() {
      return this.t;
   }

   public void e(int $$0) {
      this.t = $$0;
   }

   public int L() {
      return this.b() ? 0 : this.s;
   }

   public void f(int $$0) {
      this.s = $$0;
   }

   public void g(int $$0) {
      this.f(this.L() + $$0);
   }

   public void h(int $$0) {
      this.g(-$$0);
   }

   public void b(csa $$0, blg $$1, int $$2) {
      this.d().a($$0, $$1, this, $$2);
   }

   public void a(can $$0) {
      this.d().a($$0);
   }

   public boolean M() {
      return this.d().u();
   }

   public aqq N() {
      return this.d().am_();
   }

   public aqq O() {
      return this.d().an_();
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e,
      f,
      g,
      h;

      private final int i = 1 << this.ordinal();

      public int a() {
         return this.i;
      }
   }
}
