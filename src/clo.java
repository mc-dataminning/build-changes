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

public final class clo {
   public static final Codec<clo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               kc.i.q().fieldOf("id").forGetter(clo::d),
               Codec.INT.fieldOf("Count").forGetter(clo::L),
               sd.a.optionalFieldOf("tag").forGetter($$0x -> Optional.ofNullable($$0x.v()))
            )
            .apply($$0, clo::new)
   );
   private static final Logger j = LogUtils.getLogger();
   public static final clo b = new clo((Void)null);
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
   private static final uv p = uv.c("item.disabled").a(n.m);
   private static final int q = 0;
   private static final vs r = vs.a.a(n.f).b(true);
   private int s;
   private int t;
   @Deprecated
   @Nullable
   private final clj u;
   @Nullable
   private sd v;
   @Nullable
   private bkv w;
   @Nullable
   private ciw x;
   @Nullable
   private ciw y;

   public Optional<ciu> a() {
      return this.d().h(this);
   }

   public clo(cse $$0) {
      this($$0, 1);
   }

   public clo(ig<clj> $$0) {
      this($$0.a(), 1);
   }

   private clo(cse $$0, int $$1, Optional<sd> $$2) {
      this($$0, $$1);
      $$2.ifPresent(this::c);
   }

   public clo(ig<clj> $$0, int $$1) {
      this($$0.a(), $$1);
   }

   public clo(cse $$0, int $$1) {
      this.u = $$0.k();
      this.s = $$1;
      if (this.u.o()) {
         this.b(this.k());
      }
   }

   private clo(@Nullable Void $$0) {
      this.u = null;
   }

   private clo(sd $$0) {
      this.u = kc.i.a(new agm($$0.l("id")));
      this.s = $$0.f("Count");
      if ($$0.b("tag", 10)) {
         this.v = $$0.p("tag");
         this.d().b(this.v);
      }

      if (this.d().o()) {
         this.b(this.k());
      }
   }

   public static clo a(sd $$0) {
      try {
         return new clo($$0);
      } catch (RuntimeException var2) {
         j.debug("Tried to load invalid item: {}", $$0, var2);
         return b;
      }
   }

   public boolean b() {
      return this == b || this.u == clr.a || this.s <= 0;
   }

   public boolean a(cgi $$0) {
      return this.b() || this.d().a($$0);
   }

   public clo a(int $$0) {
      int $$1 = Math.min($$0, this.L());
      clo $$2 = this.c($$1);
      this.h($$1);
      return $$2;
   }

   public clo c() {
      if (this.b()) {
         return b;
      } else {
         clo $$0 = this.p();
         this.f(0);
         return $$0;
      }
   }

   public clj d() {
      return this.b() ? clr.a : this.u;
   }

   public ig<clj> e() {
      return this.d().j();
   }

   public boolean a(arz<clj> $$0) {
      return this.d().j().a($$0);
   }

   public boolean a(clj $$0) {
      return this.d() == $$0;
   }

   public boolean a(Predicate<ig<clj>> $$0) {
      return $$0.test(this.d().j());
   }

   public boolean a(ig<clj> $$0) {
      return this.d().j() == $$0;
   }

   public boolean a(ik<clj> $$0) {
      return $$0.a(this.e());
   }

   public Stream<arz<clj>> f() {
      return this.d().j().c();
   }

   public bjb a(cny $$0) {
      cdz $$1 = $$0.o();
      hx $$2 = $$0.a();
      dhr $$3 = new dhr($$0.q(), $$2, false);
      if ($$1 != null && !$$1.fU().e && !this.a($$0.q().I_().d(kd.e), $$3)) {
         return bjb.d;
      } else {
         clj $$4 = this.d();
         bjb $$5 = $$4.a($$0);
         if ($$1 != null && $$5.c()) {
            $$1.b(arf.c.b($$4));
         }

         return $$5;
      }
   }

   public float a(dhn $$0) {
      return this.d().a(this, $$0);
   }

   public bjc<clo> a(csf $$0, cdz $$1, bja $$2) {
      return this.d().a($$0, $$1, $$2);
   }

   public clo a(csf $$0, bll $$1) {
      return this.d().a(this, $$0, $$1);
   }

   public sd b(sd $$0) {
      agm $$1 = kc.i.b(this.d());
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
         sd $$0 = this.v();
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

   public boolean a(int $$0, atw $$1, @Nullable amj $$2) {
      if (!this.i()) {
         return false;
      } else {
         if ($$0 > 0) {
            int $$3 = cqb.a(cqd.w, this);
            int $$4 = 0;

            for (int $$5 = 0; $$3 > 0 && $$5 < $$0; $$5++) {
               if (cpx.a(this, $$3, $$1)) {
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

   public <T extends bll> void a(int $$0, T $$1, Consumer<T> $$2) {
      if (!$$1.dN().B && (!($$1 instanceof cdz) || !((cdz)$$1).fU().d)) {
         if (this.i()) {
            if (this.a($$0, $$1.eh(), $$1 instanceof amj ? (amj)$$1 : null)) {
               $$2.accept($$1);
               clj $$3 = this.d();
               this.h(1);
               if ($$1 instanceof cdz) {
                  ((cdz)$$1).b(arf.d.b($$3));
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

   public boolean a(cim $$0, cgz $$1, cdz $$2) {
      return this.d().a(this, $$0, $$1, $$2);
   }

   public boolean a(clo $$0, cim $$1, cgz $$2, cdz $$3, bmd $$4) {
      return this.d().a(this, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(bll $$0, cdz $$1) {
      clj $$2 = this.d();
      if ($$2.a(this, $$0, $$1)) {
         $$1.b(arf.c.b($$2));
      }
   }

   public void a(csf $$0, dhn $$1, hx $$2, cdz $$3) {
      clj $$4 = this.d();
      if ($$4.a(this, $$0, $$1, $$2, $$3)) {
         $$3.b(arf.c.b($$4));
      }
   }

   public boolean b(dhn $$0) {
      return this.d().a_($$0);
   }

   public bjb a(cdz $$0, bll $$1, bja $$2) {
      return this.d().a(this, $$0, $$1, $$2);
   }

   public clo p() {
      if (this.b()) {
         return b;
      } else {
         clo $$0 = new clo(this.d(), this.s);
         $$0.e(this.K());
         if (this.v != null) {
            $$0.v = this.v.h();
         }

         return $$0;
      }
   }

   public clo c(int $$0) {
      if (this.b()) {
         return b;
      } else {
         clo $$1 = this.p();
         $$1.f($$0);
         return $$1;
      }
   }

   public static boolean a(clo $$0, clo $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return $$0.L() != $$1.L() ? false : c($$0, $$1);
      }
   }

   public static boolean b(clo $$0, clo $$1) {
      return $$0.a($$1.d());
   }

   public static boolean c(clo $$0, clo $$1) {
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

   public void a(csf $$0, bkv $$1, int $$2, boolean $$3) {
      if (this.t > 0) {
         this.t--;
      }

      if (this.d() != null) {
         this.d().a(this, $$0, $$1, $$2, $$3);
      }
   }

   public void a(csf $$0, cdz $$1, int $$2) {
      $$1.a(arf.b.b(this.d()), $$2);
      this.d().b(this, $$0, $$1);
   }

   public void a(csf $$0) {
      this.d().a(this, $$0);
   }

   public int r() {
      return this.d().b(this);
   }

   public cnh s() {
      return this.d().c(this);
   }

   public void a(csf $$0, bll $$1, int $$2) {
      this.d().a(this, $$0, $$1, $$2);
   }

   public boolean t() {
      return this.d().l(this);
   }

   public boolean u() {
      return !this.b() && this.v != null && !this.v.g();
   }

   @Nullable
   public sd v() {
      return this.v;
   }

   public sd w() {
      if (this.v == null) {
         this.c(new sd());
      }

      return this.v;
   }

   public sd a(String $$0) {
      if (this.v != null && this.v.b($$0, 10)) {
         return this.v.p($$0);
      } else {
         sd $$1 = new sd();
         this.a($$0, $$1);
         return $$1;
      }
   }

   @Nullable
   public sd b(String $$0) {
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

   public sj x() {
      return this.v != null ? this.v.c("Enchantments", 10) : new sj();
   }

   public void c(@Nullable sd $$0) {
      this.v = $$0;
      if (this.d().o()) {
         this.b(this.k());
      }

      if ($$0 != null) {
         this.d().b($$0);
      }
   }

   public uv y() {
      sd $$0 = this.b("display");
      if ($$0 != null && $$0.b("Name", 8)) {
         try {
            uv $$1 = uv.a.a($$0.l("Name"));
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

   public clo a(@Nullable uv $$0) {
      sd $$1 = this.a("display");
      if ($$0 != null) {
         $$1.a("Name", uv.a.a($$0));
      } else {
         $$1.r("Name");
      }

      return this;
   }

   public void z() {
      sd $$0 = this.b("display");
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
      sd $$0 = this.b("display");
      return $$0 != null && $$0.b("Name", 8);
   }

   public List<uv> a(@Nullable cdz $$0, cnf $$1) {
      List<uv> $$2 = Lists.newArrayList();
      vj $$3 = uv.i().b(this.y()).a(this.C().e);
      if (this.A()) {
         $$3.a(n.u);
      }

      $$2.add($$3);
      if (!$$1.a() && !this.A() && this.a(clr.rR)) {
         Integer $$4 = clv.d(this);
         if ($$4 != null) {
            $$2.add(clv.k(this));
         }
      }

      int $$5 = this.P();
      if (a($$5, clo.a.f)) {
         this.d().a(this, $$0 == null ? null : $$0.dN(), $$2, $$1);
      }

      if (this.u()) {
         if (a($$5, clo.a.h) && $$0 != null) {
            cnq.a(this, $$0.dN().I_(), $$2);
         }

         if (a($$5, clo.a.a)) {
            a($$2, this.x());
         }

         if (this.v.b("display", 10)) {
            sd $$6 = this.v.p("display");
            if (a($$5, clo.a.g) && $$6.b("color", 99)) {
               if ($$1.a()) {
                  $$2.add(uv.a("item.color", String.format(Locale.ROOT, "#%06X", $$6.h("color"))).a(n.h));
               } else {
                  $$2.add(uv.c("item.dyed").a(n.h, n.u));
               }
            }

            if ($$6.d("Lore") == 9) {
               sj $$7 = $$6.c("Lore", 8);

               for (int $$8 = 0; $$8 < $$7.size(); $$8++) {
                  String $$9 = $$7.j($$8);

                  try {
                     vj $$10 = uv.a.a($$9);
                     if ($$10 != null) {
                        $$2.add(uy.a($$10, r));
                     }
                  } catch (Exception var19) {
                     $$6.r("Lore");
                  }
               }
            }
         }
      }

      if (a($$5, clo.a.b)) {
         for (bla $$12 : bla.values()) {
            Multimap<bmm, bmp> $$13 = this.a($$12);
            if (!$$13.isEmpty()) {
               $$2.add(uu.a);
               $$2.add(uv.c("item.modifiers." + $$12.e()).a(n.h));

               for (Entry<bmm, bmp> $$14 : $$13.entries()) {
                  bmp $$15 = $$14.getValue();
                  double $$16 = $$15.c();
                  boolean $$17 = false;
                  if ($$0 != null) {
                     if ($$15.a() == clj.m) {
                        $$16 += $$0.c(bmr.c);
                        $$16 += (double)cqb.a(this, blq.a);
                        $$17 = true;
                     } else if ($$15.a() == clj.n) {
                        $$16 += $$0.c(bmr.e);
                        $$17 = true;
                     }
                  }

                  double $$18;
                  if ($$15.b() == bmp.a.b || $$15.b() == bmp.a.c) {
                     $$18 = $$16 * 100.0;
                  } else if ($$14.getKey().equals(bmr.i)) {
                     $$18 = $$16 * 10.0;
                  } else {
                     $$18 = $$16;
                  }

                  if ($$17) {
                     $$2.add(uu.a().b(uv.a("attribute.modifier.equals." + $$15.b().a(), c.format($$18), uv.c($$14.getKey().c()))).a(n.c));
                  } else if ($$16 > 0.0) {
                     $$2.add(uv.a("attribute.modifier.plus." + $$15.b().a(), c.format($$18), uv.c($$14.getKey().c())).a(n.j));
                  } else if ($$16 < 0.0) {
                     $$18 *= -1.0;
                     $$2.add(uv.a("attribute.modifier.take." + $$15.b().a(), c.format($$18), uv.c($$14.getKey().c())).a(n.m));
                  }
               }
            }
         }
      }

      if (this.u()) {
         if (a($$5, clo.a.c) && this.v.q("Unbreakable")) {
            $$2.add(uv.c("item.unbreakable").a(n.j));
         }

         if (a($$5, clo.a.d) && this.v.b("CanDestroy", 9)) {
            sj $$21 = this.v.c("CanDestroy", 8);
            if (!$$21.isEmpty()) {
               $$2.add(uu.a);
               $$2.add(uv.c("item.canBreak").a(n.h));

               for (int $$22 = 0; $$22 < $$21.size(); $$22++) {
                  $$2.addAll(d($$21.j($$22)));
               }
            }
         }

         if (a($$5, clo.a.e) && this.v.b("CanPlaceOn", 9)) {
            sj $$23 = this.v.c("CanPlaceOn", 8);
            if (!$$23.isEmpty()) {
               $$2.add(uu.a);
               $$2.add(uv.c("item.canPlace").a(n.h));

               for (int $$24 = 0; $$24 < $$23.size(); $$24++) {
                  $$2.addAll(d($$23.j($$24)));
               }
            }
         }
      }

      if ($$1.a()) {
         if (this.j()) {
            $$2.add(uv.a("item.durability", this.l() - this.k(), this.l()));
         }

         $$2.add(uv.b(kc.i.b(this.d()).toString()).a(n.i));
         if (this.u()) {
            $$2.add(uv.a("item.nbt_tags", this.v.e().size()).a(n.i));
         }
      }

      if ($$0 != null && !this.d().a($$0.dN().H())) {
         $$2.add(p);
      }

      return $$2;
   }

   private static boolean a(int $$0, clo.a $$1) {
      return ($$0 & $$1.a()) == 0;
   }

   private int P() {
      return this.u() && this.v.b("HideFlags", 99) ? this.v.h("HideFlags") : 0;
   }

   public void a(clo.a $$0) {
      sd $$1 = this.w();
      $$1.a("HideFlags", $$1.h("HideFlags") | $$0.a());
   }

   public static void a(List<uv> $$0, sj $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         sd $$3 = $$1.a($$2);
         kc.g.b(cqb.b($$3)).ifPresent($$2x -> $$0.add($$2x.d(cqb.a($$3))));
      }
   }

   private static Collection<uv> d(String $$0) {
      try {
         return (Collection<uv>)fk.b(kc.f.p(), $$0, true)
            .map(
               $$0x -> Lists.newArrayList(new uv[]{$$0x.a().b().f().a(n.i)}),
               $$0x -> $$0x.a().a().map($$0xx -> ((cvf)$$0xx.a()).f().a(n.i)).collect(Collectors.toList())
            );
      } catch (CommandSyntaxException var2) {
         return Lists.newArrayList(new uv[]{uv.b("missingno").a(n.i)});
      }
   }

   public boolean B() {
      return this.d().i(this);
   }

   public cmf C() {
      return this.d().n(this);
   }

   public boolean D() {
      return !this.d().d_(this) ? false : !this.E();
   }

   public void a(cpz $$0, int $$1) {
      this.w();
      if (!this.v.b("Enchantments", 9)) {
         this.v.a("Enchantments", new sj());
      }

      sj $$2 = this.v.c("Enchantments", 10);
      $$2.add(cqb.a(cqb.a($$0), (byte)$$1));
   }

   public boolean E() {
      return this.v != null && this.v.b("Enchantments", 9) ? !this.v.c("Enchantments", 10).isEmpty() : false;
   }

   public void a(String $$0, ta $$1) {
      this.w().a($$0, $$1);
   }

   public boolean F() {
      return this.w instanceof cal;
   }

   public void a(@Nullable bkv $$0) {
      this.w = $$0;
   }

   @Nullable
   public cal G() {
      return this.w instanceof cal ? (cal)this.H() : null;
   }

   @Nullable
   public bkv H() {
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

   public Multimap<bmm, bmp> a(bla $$0) {
      Multimap<bmm, bmp> $$1;
      if (this.u() && this.v.b("AttributeModifiers", 9)) {
         $$1 = HashMultimap.create();
         sj $$2 = this.v.c("AttributeModifiers", 10);

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            sd $$4 = $$2.a($$3);
            if (!$$4.b("Slot", 8) || $$4.l("Slot").equals($$0.e())) {
               Optional<bmm> $$5 = kc.v.b(agm.a($$4.l("AttributeName")));
               if (!$$5.isEmpty()) {
                  bmp $$6 = bmp.a($$4);
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

   public void a(bmm $$0, bmp $$1, @Nullable bla $$2) {
      this.w();
      if (!this.v.b("AttributeModifiers", 9)) {
         this.v.a("AttributeModifiers", new sj());
      }

      sj $$3 = this.v.c("AttributeModifiers", 10);
      sd $$4 = $$1.d();
      $$4.a("AttributeName", kc.v.b($$0).toString());
      if ($$2 != null) {
         $$4.a("Slot", $$2.e());
      }

      $$3.add($$4);
   }

   public uv J() {
      vj $$0 = uv.i().b(this.y());
      if (this.A()) {
         $$0.a(n.u);
      }

      vj $$1 = uy.a((uv)$$0);
      if (!this.b()) {
         $$1.a(this.C().e).a($$0x -> $$0x.a(new vb(vb.a.b, new vb.c(this))));
      }

      return $$1;
   }

   public boolean a(is<cvf> $$0, dhr $$1) {
      if (this.y == null) {
         this.y = new ciw("CanPlaceOn");
      }

      return this.y.a(this, $$0, $$1);
   }

   public boolean b(is<cvf> $$0, dhr $$1) {
      if (this.x == null) {
         this.x = new ciw("CanDestroy");
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

   public void b(csf $$0, bll $$1, int $$2) {
      this.d().a($$0, $$1, this, $$2);
   }

   public void a(cas $$0) {
      this.d().a($$0);
   }

   public boolean M() {
      return this.d().u();
   }

   public aqu N() {
      return this.d().ao_();
   }

   public aqu O() {
      return this.d().ap_();
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
