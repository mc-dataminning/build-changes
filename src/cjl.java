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

public final class cjl {
   public static final Codec<cjl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jb.i.q().fieldOf("id").forGetter(cjl::d),
               Codec.INT.fieldOf("Count").forGetter(cjl::L),
               qw.a.optionalFieldOf("tag").forGetter($$0x -> Optional.ofNullable($$0x.v()))
            )
            .apply($$0, cjl::new)
   );
   private static final Logger j = LogUtils.getLogger();
   public static final cjl b = new cjl((Void)null);
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
   private static final tl p = tl.c("item.disabled").a(n.m);
   private static final int q = 0;
   private static final ui r = ui.a.a(n.f).b(true);
   private int s;
   private int t;
   @Deprecated
   @Nullable
   private final cjg u;
   @Nullable
   private qw v;
   @Nullable
   private biw w;
   @Nullable
   private cgt x;
   @Nullable
   private cgt y;

   public Optional<cgr> a() {
      return this.d().h(this);
   }

   public cjl(cqa $$0) {
      this($$0, 1);
   }

   public cjl(he<cjg> $$0) {
      this($$0.a(), 1);
   }

   private cjl(cqa $$0, int $$1, Optional<qw> $$2) {
      this($$0, $$1);
      $$2.ifPresent(this::c);
   }

   public cjl(he<cjg> $$0, int $$1) {
      this($$0.a(), $$1);
   }

   public cjl(cqa $$0, int $$1) {
      this.u = $$0.k();
      this.s = $$1;
      if (this.u.o()) {
         this.b(this.k());
      }
   }

   private cjl(@Nullable Void $$0) {
      this.u = null;
   }

   private cjl(qw $$0) {
      this.u = jb.i.a(new aez($$0.l("id")));
      this.s = $$0.f("Count");
      if ($$0.b("tag", 10)) {
         this.v = $$0.p("tag");
         this.d().b(this.v);
      }

      if (this.d().o()) {
         this.b(this.k());
      }
   }

   public static cjl a(qw $$0) {
      try {
         return new cjl($$0);
      } catch (RuntimeException var2) {
         j.debug("Tried to load invalid item: {}", $$0, var2);
         return b;
      }
   }

   public boolean b() {
      return this == b || this.u == cjo.a || this.s <= 0;
   }

   public boolean a(cei $$0) {
      return this.b() || this.d().a($$0);
   }

   public cjl a(int $$0) {
      int $$1 = Math.min($$0, this.L());
      cjl $$2 = this.c($$1);
      this.h($$1);
      return $$2;
   }

   public cjl c() {
      if (this.b()) {
         return b;
      } else {
         cjl $$0 = this.p();
         this.f(0);
         return $$0;
      }
   }

   public cjg d() {
      return this.b() ? cjo.a : this.u;
   }

   public he<cjg> e() {
      return this.d().j();
   }

   public boolean a(aqk<cjg> $$0) {
      return this.d().j().a($$0);
   }

   public boolean a(cjg $$0) {
      return this.d() == $$0;
   }

   public boolean a(Predicate<he<cjg>> $$0) {
      return $$0.test(this.d().j());
   }

   public boolean a(he<cjg> $$0) {
      return this.d().j() == $$0;
   }

   public boolean a(hi<cjg> $$0) {
      return $$0.a(this.e());
   }

   public Stream<aqk<cjg>> f() {
      return this.d().j().c();
   }

   public bhe a(clv $$0) {
      cca $$1 = $$0.o();
      gw $$2 = $$0.a();
      dfh $$3 = new dfh($$0.q(), $$2, false);
      if ($$1 != null && !$$1.fT().e && !this.a($$0.q().G_().d(jc.e), $$3)) {
         return bhe.d;
      } else {
         cjg $$4 = this.d();
         bhe $$5 = $$4.a($$0);
         if ($$1 != null && $$5.c()) {
            $$1.b(apq.c.b($$4));
         }

         return $$5;
      }
   }

   public float a(dfd $$0) {
      return this.d().a(this, $$0);
   }

   public bhf<cjl> a(cqb $$0, cca $$1, bhd $$2) {
      return this.d().a($$0, $$1, $$2);
   }

   public cjl a(cqb $$0, bjm $$1) {
      return this.d().a(this, $$0, $$1);
   }

   public qw b(qw $$0) {
      aez $$1 = jb.i.b(this.d());
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
         qw $$0 = this.v();
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

   public boolean a(int $$0, ash $$1, @Nullable aku $$2) {
      if (!this.i()) {
         return false;
      } else {
         if ($$0 > 0) {
            int $$3 = cnw.a(cny.w, this);
            int $$4 = 0;

            for (int $$5 = 0; $$3 > 0 && $$5 < $$0; $$5++) {
               if (cns.a(this, $$3, $$1)) {
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

   public <T extends bjm> void a(int $$0, T $$1, Consumer<T> $$2) {
      if (!$$1.dL().B && (!($$1 instanceof cca) || !((cca)$$1).fT().d)) {
         if (this.i()) {
            if (this.a($$0, $$1.ef(), $$1 instanceof aku ? (aku)$$1 : null)) {
               $$2.accept($$1);
               cjg $$3 = this.d();
               this.h(1);
               if ($$1 instanceof cca) {
                  ((cca)$$1).b(apq.d.b($$3));
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

   public boolean a(cgj $$0, cez $$1, cca $$2) {
      return this.d().a(this, $$0, $$1, $$2);
   }

   public boolean a(cjl $$0, cgj $$1, cez $$2, cca $$3, bke $$4) {
      return this.d().a(this, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(bjm $$0, cca $$1) {
      cjg $$2 = this.d();
      if ($$2.a(this, $$0, $$1)) {
         $$1.b(apq.c.b($$2));
      }
   }

   public void a(cqb $$0, dfd $$1, gw $$2, cca $$3) {
      cjg $$4 = this.d();
      if ($$4.a(this, $$0, $$1, $$2, $$3)) {
         $$3.b(apq.c.b($$4));
      }
   }

   public boolean b(dfd $$0) {
      return this.d().a_($$0);
   }

   public bhe a(cca $$0, bjm $$1, bhd $$2) {
      return this.d().a(this, $$0, $$1, $$2);
   }

   public cjl p() {
      if (this.b()) {
         return b;
      } else {
         cjl $$0 = new cjl(this.d(), this.s);
         $$0.e(this.K());
         if (this.v != null) {
            $$0.v = this.v.h();
         }

         return $$0;
      }
   }

   public cjl c(int $$0) {
      if (this.b()) {
         return b;
      } else {
         cjl $$1 = this.p();
         $$1.f($$0);
         return $$1;
      }
   }

   public static boolean a(cjl $$0, cjl $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return $$0.L() != $$1.L() ? false : c($$0, $$1);
      }
   }

   public static boolean b(cjl $$0, cjl $$1) {
      return $$0.a($$1.d());
   }

   public static boolean c(cjl $$0, cjl $$1) {
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

   public void a(cqb $$0, biw $$1, int $$2, boolean $$3) {
      if (this.t > 0) {
         this.t--;
      }

      if (this.d() != null) {
         this.d().a(this, $$0, $$1, $$2, $$3);
      }
   }

   public void a(cqb $$0, cca $$1, int $$2) {
      $$1.a(apq.b.b(this.d()), $$2);
      this.d().b(this, $$0, $$1);
   }

   public int r() {
      return this.d().b(this);
   }

   public cle s() {
      return this.d().c(this);
   }

   public void a(cqb $$0, bjm $$1, int $$2) {
      this.d().a(this, $$0, $$1, $$2);
   }

   public boolean t() {
      return this.d().l(this);
   }

   public boolean u() {
      return !this.b() && this.v != null && !this.v.g();
   }

   @Nullable
   public qw v() {
      return this.v;
   }

   public qw w() {
      if (this.v == null) {
         this.c(new qw());
      }

      return this.v;
   }

   public qw a(String $$0) {
      if (this.v != null && this.v.b($$0, 10)) {
         return this.v.p($$0);
      } else {
         qw $$1 = new qw();
         this.a($$0, $$1);
         return $$1;
      }
   }

   @Nullable
   public qw b(String $$0) {
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

   public rc x() {
      return this.v != null ? this.v.c("Enchantments", 10) : new rc();
   }

   public void c(@Nullable qw $$0) {
      this.v = $$0;
      if (this.d().o()) {
         this.b(this.k());
      }

      if ($$0 != null) {
         this.d().b($$0);
      }
   }

   public tl y() {
      qw $$0 = this.b("display");
      if ($$0 != null && $$0.b("Name", 8)) {
         try {
            tl $$1 = tl.a.a($$0.l("Name"));
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

   public cjl a(@Nullable tl $$0) {
      qw $$1 = this.a("display");
      if ($$0 != null) {
         $$1.a("Name", tl.a.a($$0));
      } else {
         $$1.r("Name");
      }

      return this;
   }

   public void z() {
      qw $$0 = this.b("display");
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
      qw $$0 = this.b("display");
      return $$0 != null && $$0.b("Name", 8);
   }

   public List<tl> a(@Nullable cca $$0, clc $$1) {
      List<tl> $$2 = Lists.newArrayList();
      tz $$3 = tl.i().b(this.y()).a(this.C().e);
      if (this.A()) {
         $$3.a(n.u);
      }

      $$2.add($$3);
      if (!$$1.a() && !this.A() && this.a(cjo.rf)) {
         Integer $$4 = cjs.d(this);
         if ($$4 != null) {
            $$2.add(cjs.k(this));
         }
      }

      int $$5 = this.P();
      if (a($$5, cjl.a.f)) {
         this.d().a(this, $$0 == null ? null : $$0.dL(), $$2, $$1);
      }

      if (this.u()) {
         if (a($$5, cjl.a.h) && $$0 != null) {
            cln.a(this, $$0.dL().G_(), $$2);
         }

         if (a($$5, cjl.a.a)) {
            a($$2, this.x());
         }

         if (this.v.b("display", 10)) {
            qw $$6 = this.v.p("display");
            if (a($$5, cjl.a.g) && $$6.b("color", 99)) {
               if ($$1.a()) {
                  $$2.add(tl.a("item.color", String.format(Locale.ROOT, "#%06X", $$6.h("color"))).a(n.h));
               } else {
                  $$2.add(tl.c("item.dyed").a(n.h, n.u));
               }
            }

            if ($$6.d("Lore") == 9) {
               rc $$7 = $$6.c("Lore", 8);

               for (int $$8 = 0; $$8 < $$7.size(); $$8++) {
                  String $$9 = $$7.j($$8);

                  try {
                     tz $$10 = tl.a.a($$9);
                     if ($$10 != null) {
                        $$2.add(to.a($$10, r));
                     }
                  } catch (Exception var19) {
                     $$6.r("Lore");
                  }
               }
            }
         }
      }

      if (a($$5, cjl.a.b)) {
         for (bjb $$12 : bjb.values()) {
            Multimap<bkn, bkq> $$13 = this.a($$12);
            if (!$$13.isEmpty()) {
               $$2.add(tk.a);
               $$2.add(tl.c("item.modifiers." + $$12.e()).a(n.h));

               for (Entry<bkn, bkq> $$14 : $$13.entries()) {
                  bkq $$15 = $$14.getValue();
                  double $$16 = $$15.c();
                  boolean $$17 = false;
                  if ($$0 != null) {
                     if ($$15.a() == cjg.m) {
                        $$16 += $$0.c(bks.c);
                        $$16 += (double)cnw.a(this, bjr.a);
                        $$17 = true;
                     } else if ($$15.a() == cjg.n) {
                        $$16 += $$0.c(bks.e);
                        $$17 = true;
                     }
                  }

                  double $$18;
                  if ($$15.b() == bkq.a.b || $$15.b() == bkq.a.c) {
                     $$18 = $$16 * 100.0;
                  } else if ($$14.getKey().equals(bks.i)) {
                     $$18 = $$16 * 10.0;
                  } else {
                     $$18 = $$16;
                  }

                  if ($$17) {
                     $$2.add(tk.a().b(tl.a("attribute.modifier.equals." + $$15.b().a(), c.format($$18), tl.c($$14.getKey().c()))).a(n.c));
                  } else if ($$16 > 0.0) {
                     $$2.add(tl.a("attribute.modifier.plus." + $$15.b().a(), c.format($$18), tl.c($$14.getKey().c())).a(n.j));
                  } else if ($$16 < 0.0) {
                     $$18 *= -1.0;
                     $$2.add(tl.a("attribute.modifier.take." + $$15.b().a(), c.format($$18), tl.c($$14.getKey().c())).a(n.m));
                  }
               }
            }
         }
      }

      if (this.u()) {
         if (a($$5, cjl.a.c) && this.v.q("Unbreakable")) {
            $$2.add(tl.c("item.unbreakable").a(n.j));
         }

         if (a($$5, cjl.a.d) && this.v.b("CanDestroy", 9)) {
            rc $$21 = this.v.c("CanDestroy", 8);
            if (!$$21.isEmpty()) {
               $$2.add(tk.a);
               $$2.add(tl.c("item.canBreak").a(n.h));

               for (int $$22 = 0; $$22 < $$21.size(); $$22++) {
                  $$2.addAll(d($$21.j($$22)));
               }
            }
         }

         if (a($$5, cjl.a.e) && this.v.b("CanPlaceOn", 9)) {
            rc $$23 = this.v.c("CanPlaceOn", 8);
            if (!$$23.isEmpty()) {
               $$2.add(tk.a);
               $$2.add(tl.c("item.canPlace").a(n.h));

               for (int $$24 = 0; $$24 < $$23.size(); $$24++) {
                  $$2.addAll(d($$23.j($$24)));
               }
            }
         }
      }

      if ($$1.a()) {
         if (this.j()) {
            $$2.add(tl.a("item.durability", this.l() - this.k(), this.l()));
         }

         $$2.add(tl.b(jb.i.b(this.d()).toString()).a(n.i));
         if (this.u()) {
            $$2.add(tl.a("item.nbt_tags", this.v.e().size()).a(n.i));
         }
      }

      if ($$0 != null && !this.d().a($$0.dL().G())) {
         $$2.add(p);
      }

      return $$2;
   }

   private static boolean a(int $$0, cjl.a $$1) {
      return ($$0 & $$1.a()) == 0;
   }

   private int P() {
      return this.u() && this.v.b("HideFlags", 99) ? this.v.h("HideFlags") : 0;
   }

   public void a(cjl.a $$0) {
      qw $$1 = this.w();
      $$1.a("HideFlags", $$1.h("HideFlags") | $$0.a());
   }

   public static void a(List<tl> $$0, rc $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         qw $$3 = $$1.a($$2);
         jb.g.b(cnw.b($$3)).ifPresent($$2x -> $$0.add($$2x.d(cnw.a($$3))));
      }
   }

   private static Collection<tl> d(String $$0) {
      try {
         return (Collection<tl>)fi.b(jb.f.p(), $$0, true)
            .map(
               $$0x -> Lists.newArrayList(new tl[]{$$0x.a().b().f().a(n.i)}),
               $$0x -> $$0x.a().a().map($$0xx -> ((ctc)$$0xx.a()).f().a(n.i)).collect(Collectors.toList())
            );
      } catch (CommandSyntaxException var2) {
         return Lists.newArrayList(new tl[]{tl.b("missingno").a(n.i)});
      }
   }

   public boolean B() {
      return this.d().i(this);
   }

   public ckc C() {
      return this.d().n(this);
   }

   public boolean D() {
      return !this.d().d_(this) ? false : !this.E();
   }

   public void a(cnu $$0, int $$1) {
      this.w();
      if (!this.v.b("Enchantments", 9)) {
         this.v.a("Enchantments", new rc());
      }

      rc $$2 = this.v.c("Enchantments", 10);
      $$2.add(cnw.a(cnw.a($$0), (byte)$$1));
   }

   public boolean E() {
      return this.v != null && this.v.b("Enchantments", 9) ? !this.v.c("Enchantments", 10).isEmpty() : false;
   }

   public void a(String $$0, rq $$1) {
      this.w().a($$0, $$1);
   }

   public boolean F() {
      return this.w instanceof bym;
   }

   public void a(@Nullable biw $$0) {
      this.w = $$0;
   }

   @Nullable
   public bym G() {
      return this.w instanceof bym ? (bym)this.H() : null;
   }

   @Nullable
   public biw H() {
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

   public Multimap<bkn, bkq> a(bjb $$0) {
      Multimap<bkn, bkq> $$1;
      if (this.u() && this.v.b("AttributeModifiers", 9)) {
         $$1 = HashMultimap.create();
         rc $$2 = this.v.c("AttributeModifiers", 10);

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            qw $$4 = $$2.a($$3);
            if (!$$4.b("Slot", 8) || $$4.l("Slot").equals($$0.e())) {
               Optional<bkn> $$5 = jb.v.b(aez.a($$4.l("AttributeName")));
               if (!$$5.isEmpty()) {
                  bkq $$6 = bkq.a($$4);
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

   public void a(bkn $$0, bkq $$1, @Nullable bjb $$2) {
      this.w();
      if (!this.v.b("AttributeModifiers", 9)) {
         this.v.a("AttributeModifiers", new rc());
      }

      rc $$3 = this.v.c("AttributeModifiers", 10);
      qw $$4 = $$1.d();
      $$4.a("AttributeName", jb.v.b($$0).toString());
      if ($$2 != null) {
         $$4.a("Slot", $$2.e());
      }

      $$3.add($$4);
   }

   public tl J() {
      tz $$0 = tl.i().b(this.y());
      if (this.A()) {
         $$0.a(n.u);
      }

      tz $$1 = to.a((tl)$$0);
      if (!this.b()) {
         $$1.a(this.C().e).a($$0x -> $$0x.a(new tr(tr.a.b, new tr.c(this))));
      }

      return $$1;
   }

   public boolean a(hq<ctc> $$0, dfh $$1) {
      if (this.y == null) {
         this.y = new cgt("CanPlaceOn");
      }

      return this.y.a(this, $$0, $$1);
   }

   public boolean b(hq<ctc> $$0, dfh $$1) {
      if (this.x == null) {
         this.x = new cgt("CanDestroy");
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

   public void b(cqb $$0, bjm $$1, int $$2) {
      this.d().a($$0, $$1, this, $$2);
   }

   public void a(byt $$0) {
      this.d().a($$0);
   }

   public boolean M() {
      return this.d().u();
   }

   public apf N() {
      return this.d().aj_();
   }

   public apf O() {
      return this.d().ak_();
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
