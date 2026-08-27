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

public final class cjf {
   public static final Codec<cjf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jd.i.q().fieldOf("id").forGetter(cjf::d),
               Codec.INT.fieldOf("Count").forGetter(cjf::L),
               qy.a.optionalFieldOf("tag").forGetter($$0x -> Optional.ofNullable($$0x.v()))
            )
            .apply($$0, cjf::new)
   );
   private static final Logger j = LogUtils.getLogger();
   public static final cjf b = new cjf((Void)null);
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
   private static final tm p = tm.c("item.disabled").a(n.m);
   private static final int q = 0;
   private static final ui r = ui.a.a(n.f).b(true);
   private int s;
   private int t;
   @Deprecated
   @Nullable
   private final cja u;
   @Nullable
   private qy v;
   @Nullable
   private biq w;
   @Nullable
   private cgn x;
   @Nullable
   private cgn y;

   public Optional<cgl> a() {
      return this.d().h(this);
   }

   public cjf(cpu $$0) {
      this($$0, 1);
   }

   public cjf(hg<cja> $$0) {
      this($$0.a(), 1);
   }

   private cjf(cpu $$0, int $$1, Optional<qy> $$2) {
      this($$0, $$1);
      $$2.ifPresent(this::c);
   }

   public cjf(hg<cja> $$0, int $$1) {
      this($$0.a(), $$1);
   }

   public cjf(cpu $$0, int $$1) {
      this.u = $$0.k();
      this.s = $$1;
      if (this.u.o()) {
         this.b(this.k());
      }
   }

   private cjf(@Nullable Void $$0) {
      this.u = null;
   }

   private cjf(qy $$0) {
      this.u = jd.i.a(new aex($$0.l("id")));
      this.s = $$0.f("Count");
      if ($$0.b("tag", 10)) {
         this.v = $$0.p("tag");
         this.d().b(this.v);
      }

      if (this.d().o()) {
         this.b(this.k());
      }
   }

   public static cjf a(qy $$0) {
      try {
         return new cjf($$0);
      } catch (RuntimeException var2) {
         j.debug("Tried to load invalid item: {}", $$0, var2);
         return b;
      }
   }

   public boolean b() {
      return this == b || this.u == cji.a || this.s <= 0;
   }

   public boolean a(cec $$0) {
      return this.b() || this.d().a($$0);
   }

   public cjf a(int $$0) {
      int $$1 = Math.min($$0, this.L());
      cjf $$2 = this.c($$1);
      this.h($$1);
      return $$2;
   }

   public cjf c() {
      if (this.b()) {
         return b;
      } else {
         cjf $$0 = this.p();
         this.f(0);
         return $$0;
      }
   }

   public cja d() {
      return this.b() ? cji.a : this.u;
   }

   public hg<cja> e() {
      return this.d().j();
   }

   public boolean a(aqi<cja> $$0) {
      return this.d().j().a($$0);
   }

   public boolean a(cja $$0) {
      return this.d() == $$0;
   }

   public boolean a(Predicate<hg<cja>> $$0) {
      return $$0.test(this.d().j());
   }

   public boolean a(hg<cja> $$0) {
      return this.d().j() == $$0;
   }

   public boolean a(hk<cja> $$0) {
      return $$0.a(this.e());
   }

   public Stream<aqi<cja>> f() {
      return this.d().j().c();
   }

   public bgy a(clp $$0) {
      cbu $$1 = $$0.o();
      gw $$2 = $$0.a();
      dfn $$3 = new dfn($$0.q(), $$2, false);
      if ($$1 != null && !$$1.fS().e && !this.a($$0.q().G_().d(je.e), $$3)) {
         return bgy.d;
      } else {
         cja $$4 = this.d();
         bgy $$5 = $$4.a($$0);
         if ($$1 != null && $$5.c()) {
            $$1.b(apo.c.b($$4));
         }

         return $$5;
      }
   }

   public float a(dfj $$0) {
      return this.d().a(this, $$0);
   }

   public bgz<cjf> a(cpv $$0, cbu $$1, bgx $$2) {
      return this.d().a($$0, $$1, $$2);
   }

   public cjf a(cpv $$0, bjg $$1) {
      return this.d().a(this, $$0, $$1);
   }

   public qy b(qy $$0) {
      aex $$1 = jd.i.b(this.d());
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
         qy $$0 = this.v();
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

   public boolean a(int $$0, asc $$1, @Nullable aks $$2) {
      if (!this.i()) {
         return false;
      } else {
         if ($$0 > 0) {
            int $$3 = cnq.a(cns.w, this);
            int $$4 = 0;

            for (int $$5 = 0; $$3 > 0 && $$5 < $$0; $$5++) {
               if (cnm.a(this, $$3, $$1)) {
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

   public <T extends bjg> void a(int $$0, T $$1, Consumer<T> $$2) {
      if (!$$1.dL().B && (!($$1 instanceof cbu) || !((cbu)$$1).fS().d)) {
         if (this.i()) {
            if (this.a($$0, $$1.ef(), $$1 instanceof aks ? (aks)$$1 : null)) {
               $$2.accept($$1);
               cja $$3 = this.d();
               this.h(1);
               if ($$1 instanceof cbu) {
                  ((cbu)$$1).b(apo.d.b($$3));
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

   public boolean a(cgd $$0, cet $$1, cbu $$2) {
      return this.d().a(this, $$0, $$1, $$2);
   }

   public boolean a(cjf $$0, cgd $$1, cet $$2, cbu $$3, bjy $$4) {
      return this.d().a(this, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(bjg $$0, cbu $$1) {
      cja $$2 = this.d();
      if ($$2.a(this, $$0, $$1)) {
         $$1.b(apo.c.b($$2));
      }
   }

   public void a(cpv $$0, dfj $$1, gw $$2, cbu $$3) {
      cja $$4 = this.d();
      if ($$4.a(this, $$0, $$1, $$2, $$3)) {
         $$3.b(apo.c.b($$4));
      }
   }

   public boolean b(dfj $$0) {
      return this.d().a_($$0);
   }

   public bgy a(cbu $$0, bjg $$1, bgx $$2) {
      return this.d().a(this, $$0, $$1, $$2);
   }

   public cjf p() {
      if (this.b()) {
         return b;
      } else {
         cjf $$0 = new cjf(this.d(), this.s);
         $$0.e(this.K());
         if (this.v != null) {
            $$0.v = this.v.h();
         }

         return $$0;
      }
   }

   public cjf c(int $$0) {
      if (this.b()) {
         return b;
      } else {
         cjf $$1 = this.p();
         $$1.f($$0);
         return $$1;
      }
   }

   public static boolean a(cjf $$0, cjf $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return $$0.L() != $$1.L() ? false : c($$0, $$1);
      }
   }

   public static boolean b(cjf $$0, cjf $$1) {
      return $$0.a($$1.d());
   }

   public static boolean c(cjf $$0, cjf $$1) {
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

   public void a(cpv $$0, biq $$1, int $$2, boolean $$3) {
      if (this.t > 0) {
         this.t--;
      }

      if (this.d() != null) {
         this.d().a(this, $$0, $$1, $$2, $$3);
      }
   }

   public void a(cpv $$0, cbu $$1, int $$2) {
      $$1.a(apo.b.b(this.d()), $$2);
      this.d().b(this, $$0, $$1);
   }

   public int r() {
      return this.d().b(this);
   }

   public cky s() {
      return this.d().c(this);
   }

   public void a(cpv $$0, bjg $$1, int $$2) {
      this.d().a(this, $$0, $$1, $$2);
   }

   public boolean t() {
      return this.d().l(this);
   }

   public boolean u() {
      return !this.b() && this.v != null && !this.v.g();
   }

   @Nullable
   public qy v() {
      return this.v;
   }

   public qy w() {
      if (this.v == null) {
         this.c(new qy());
      }

      return this.v;
   }

   public qy a(String $$0) {
      if (this.v != null && this.v.b($$0, 10)) {
         return this.v.p($$0);
      } else {
         qy $$1 = new qy();
         this.a($$0, $$1);
         return $$1;
      }
   }

   @Nullable
   public qy b(String $$0) {
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

   public re x() {
      return this.v != null ? this.v.c("Enchantments", 10) : new re();
   }

   public void c(@Nullable qy $$0) {
      this.v = $$0;
      if (this.d().o()) {
         this.b(this.k());
      }

      if ($$0 != null) {
         this.d().b($$0);
      }
   }

   public tm y() {
      qy $$0 = this.b("display");
      if ($$0 != null && $$0.b("Name", 8)) {
         try {
            tm $$1 = tm.a.a($$0.l("Name"));
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

   public cjf a(@Nullable tm $$0) {
      qy $$1 = this.a("display");
      if ($$0 != null) {
         $$1.a("Name", tm.a.a($$0));
      } else {
         $$1.r("Name");
      }

      return this;
   }

   public void z() {
      qy $$0 = this.b("display");
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
      qy $$0 = this.b("display");
      return $$0 != null && $$0.b("Name", 8);
   }

   public List<tm> a(@Nullable cbu $$0, ckw $$1) {
      List<tm> $$2 = Lists.newArrayList();
      tz $$3 = tm.h().b(this.y()).a(this.C().e);
      if (this.A()) {
         $$3.a(n.u);
      }

      $$2.add($$3);
      if (!$$1.a() && !this.A() && this.a(cji.rf)) {
         Integer $$4 = cjm.d(this);
         if ($$4 != null) {
            $$2.add(cjm.k(this));
         }
      }

      int $$5 = this.P();
      if (a($$5, cjf.a.f)) {
         this.d().a(this, $$0 == null ? null : $$0.dL(), $$2, $$1);
      }

      if (this.u()) {
         if (a($$5, cjf.a.h) && $$0 != null) {
            clh.a(this, $$0.dL().G_(), $$2);
         }

         if (a($$5, cjf.a.a)) {
            a($$2, this.x());
         }

         if (this.v.b("display", 10)) {
            qy $$6 = this.v.p("display");
            if (a($$5, cjf.a.g) && $$6.b("color", 99)) {
               if ($$1.a()) {
                  $$2.add(tm.a("item.color", String.format(Locale.ROOT, "#%06X", $$6.h("color"))).a(n.h));
               } else {
                  $$2.add(tm.c("item.dyed").a(n.h, n.u));
               }
            }

            if ($$6.d("Lore") == 9) {
               re $$7 = $$6.c("Lore", 8);

               for (int $$8 = 0; $$8 < $$7.size(); $$8++) {
                  String $$9 = $$7.j($$8);

                  try {
                     tz $$10 = tm.a.a($$9);
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

      if (a($$5, cjf.a.b)) {
         for (biv $$12 : biv.values()) {
            Multimap<bkh, bkk> $$13 = this.a($$12);
            if (!$$13.isEmpty()) {
               $$2.add(tl.a);
               $$2.add(tm.c("item.modifiers." + $$12.e()).a(n.h));

               for (Entry<bkh, bkk> $$14 : $$13.entries()) {
                  bkk $$15 = $$14.getValue();
                  double $$16 = $$15.d();
                  boolean $$17 = false;
                  if ($$0 != null) {
                     if ($$15.a() == cja.m) {
                        $$16 += $$0.c(bkm.f);
                        $$16 += (double)cnq.a(this, bjl.a);
                        $$17 = true;
                     } else if ($$15.a() == cja.n) {
                        $$16 += $$0.c(bkm.h);
                        $$17 = true;
                     }
                  }

                  double $$18;
                  if ($$15.c() == bkk.a.b || $$15.c() == bkk.a.c) {
                     $$18 = $$16 * 100.0;
                  } else if ($$14.getKey().equals(bkm.c)) {
                     $$18 = $$16 * 10.0;
                  } else {
                     $$18 = $$16;
                  }

                  if ($$17) {
                     $$2.add(tl.a().b(tm.a("attribute.modifier.equals." + $$15.c().a(), c.format($$18), tm.c($$14.getKey().c()))).a(n.c));
                  } else if ($$16 > 0.0) {
                     $$2.add(tm.a("attribute.modifier.plus." + $$15.c().a(), c.format($$18), tm.c($$14.getKey().c())).a(n.j));
                  } else if ($$16 < 0.0) {
                     $$18 *= -1.0;
                     $$2.add(tm.a("attribute.modifier.take." + $$15.c().a(), c.format($$18), tm.c($$14.getKey().c())).a(n.m));
                  }
               }
            }
         }
      }

      if (this.u()) {
         if (a($$5, cjf.a.c) && this.v.q("Unbreakable")) {
            $$2.add(tm.c("item.unbreakable").a(n.j));
         }

         if (a($$5, cjf.a.d) && this.v.b("CanDestroy", 9)) {
            re $$21 = this.v.c("CanDestroy", 8);
            if (!$$21.isEmpty()) {
               $$2.add(tl.a);
               $$2.add(tm.c("item.canBreak").a(n.h));

               for (int $$22 = 0; $$22 < $$21.size(); $$22++) {
                  $$2.addAll(d($$21.j($$22)));
               }
            }
         }

         if (a($$5, cjf.a.e) && this.v.b("CanPlaceOn", 9)) {
            re $$23 = this.v.c("CanPlaceOn", 8);
            if (!$$23.isEmpty()) {
               $$2.add(tl.a);
               $$2.add(tm.c("item.canPlace").a(n.h));

               for (int $$24 = 0; $$24 < $$23.size(); $$24++) {
                  $$2.addAll(d($$23.j($$24)));
               }
            }
         }
      }

      if ($$1.a()) {
         if (this.j()) {
            $$2.add(tm.a("item.durability", this.l() - this.k(), this.l()));
         }

         $$2.add(tm.b(jd.i.b(this.d()).toString()).a(n.i));
         if (this.u()) {
            $$2.add(tm.a("item.nbt_tags", this.v.e().size()).a(n.i));
         }
      }

      if ($$0 != null && !this.d().a($$0.dL().G())) {
         $$2.add(p);
      }

      return $$2;
   }

   private static boolean a(int $$0, cjf.a $$1) {
      return ($$0 & $$1.a()) == 0;
   }

   private int P() {
      return this.u() && this.v.b("HideFlags", 99) ? this.v.h("HideFlags") : 0;
   }

   public void a(cjf.a $$0) {
      qy $$1 = this.w();
      $$1.a("HideFlags", $$1.h("HideFlags") | $$0.a());
   }

   public static void a(List<tm> $$0, re $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         qy $$3 = $$1.a($$2);
         jd.g.b(cnq.b($$3)).ifPresent($$2x -> $$0.add($$2x.d(cnq.a($$3))));
      }
   }

   private static Collection<tm> d(String $$0) {
      try {
         return (Collection<tm>)fi.b(jd.f.p(), $$0, true)
            .map(
               $$0x -> Lists.newArrayList(new tm[]{$$0x.a().b().e().a(n.i)}),
               $$0x -> $$0x.a().a().map($$0xx -> ((csv)$$0xx.a()).e().a(n.i)).collect(Collectors.toList())
            );
      } catch (CommandSyntaxException var2) {
         return Lists.newArrayList(new tm[]{tm.b("missingno").a(n.i)});
      }
   }

   public boolean B() {
      return this.d().i(this);
   }

   public cjw C() {
      return this.d().n(this);
   }

   public boolean D() {
      return !this.d().d_(this) ? false : !this.E();
   }

   public void a(cno $$0, int $$1) {
      this.w();
      if (!this.v.b("Enchantments", 9)) {
         this.v.a("Enchantments", new re());
      }

      re $$2 = this.v.c("Enchantments", 10);
      $$2.add(cnq.a(cnq.a($$0), (byte)$$1));
   }

   public boolean E() {
      return this.v != null && this.v.b("Enchantments", 9) ? !this.v.c("Enchantments", 10).isEmpty() : false;
   }

   public void a(String $$0, rr $$1) {
      this.w().a($$0, $$1);
   }

   public boolean F() {
      return this.w instanceof byg;
   }

   public void a(@Nullable biq $$0) {
      this.w = $$0;
   }

   @Nullable
   public byg G() {
      return this.w instanceof byg ? (byg)this.H() : null;
   }

   @Nullable
   public biq H() {
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

   public Multimap<bkh, bkk> a(biv $$0) {
      Multimap<bkh, bkk> $$1;
      if (this.u() && this.v.b("AttributeModifiers", 9)) {
         $$1 = HashMultimap.create();
         re $$2 = this.v.c("AttributeModifiers", 10);

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            qy $$4 = $$2.a($$3);
            if (!$$4.b("Slot", 8) || $$4.l("Slot").equals($$0.e())) {
               Optional<bkh> $$5 = jd.v.b(aex.a($$4.l("AttributeName")));
               if (!$$5.isEmpty()) {
                  bkk $$6 = bkk.a($$4);
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

   public void a(bkh $$0, bkk $$1, @Nullable biv $$2) {
      this.w();
      if (!this.v.b("AttributeModifiers", 9)) {
         this.v.a("AttributeModifiers", new re());
      }

      re $$3 = this.v.c("AttributeModifiers", 10);
      qy $$4 = $$1.e();
      $$4.a("AttributeName", jd.v.b($$0).toString());
      if ($$2 != null) {
         $$4.a("Slot", $$2.e());
      }

      $$3.add($$4);
   }

   public tm J() {
      tz $$0 = tm.h().b(this.y());
      if (this.A()) {
         $$0.a(n.u);
      }

      tz $$1 = to.a((tm)$$0);
      if (!this.b()) {
         $$1.a(this.C().e).a($$0x -> $$0x.a(new tr(tr.a.b, new tr.c(this))));
      }

      return $$1;
   }

   public boolean a(ht<csv> $$0, dfn $$1) {
      if (this.y == null) {
         this.y = new cgn("CanPlaceOn");
      }

      return this.y.a(this, $$0, $$1);
   }

   public boolean b(ht<csv> $$0, dfn $$1) {
      if (this.x == null) {
         this.x = new cgn("CanDestroy");
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

   public void b(cpv $$0, bjg $$1, int $$2) {
      this.d().a($$0, $$1, this, $$2);
   }

   public void a(byn $$0) {
      this.d().a($$0);
   }

   public boolean M() {
      return this.d().u();
   }

   public apd N() {
      return this.d().aj_();
   }

   public apd O() {
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
