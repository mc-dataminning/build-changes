import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
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
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class cmr {
   public static final Codec<cmr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               kd.h.r().fieldOf("id").forGetter(cmr::e),
               Codec.INT.fieldOf("Count").forGetter(cmr::L),
               sl.a.optionalFieldOf("tag").forGetter($$0x -> Optional.ofNullable($$0x.v()))
            )
            .apply($$0, cmr::new)
   );
   private static final Codec<cmm> n = atq.a(
      kd.h.q(), (Function<cmm, DataResult<cmm>>)($$0 -> $$0 == cmu.a ? DataResult.error(() -> "Item must not be minecraft:air") : DataResult.success($$0))
   );
   public static final Codec<cmr> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(kd.h.r().fieldOf("item").forGetter(cmr::e), atq.a(tj.i, "nbt").forGetter($$0x -> Optional.ofNullable($$0x.v())))
            .apply($$0, ($$0x, $$1) -> new cmr($$0x, 1, $$1))
   );
   public static final Codec<cmr> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(n.fieldOf("item").forGetter(cmr::d), atq.a(atq.j, "count", Integer.valueOf(1)).forGetter(cmr::L)).apply($$0, cmr::new)
   );
   public static final Codec<cmr> d = n.xmap(cmr::new, cmr::d);
   public static final MapCodec<cmr> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kd.h.q().fieldOf("result").forGetter(cmr::d), Codec.INT.fieldOf("count").forGetter(cmr::L)).apply($$0, cmr::new)
   );
   private static final Logger o = LogUtils.getLogger();
   public static final cmr f = new cmr((Void)null);
   public static final DecimalFormat g = ac.a(new DecimalFormat("#.##"), $$0 -> $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));
   public static final String h = "Enchantments";
   public static final String i = "display";
   public static final String j = "Name";
   public static final String k = "Lore";
   public static final String l = "Damage";
   public static final String m = "color";
   private static final String p = "Unbreakable";
   private static final String q = "RepairCost";
   private static final String r = "CanDestroy";
   private static final String s = "CanPlaceOn";
   private static final String t = "HideFlags";
   private static final vd u = vd.c("item.disabled").a(n.m);
   private static final int v = 0;
   private static final wa w = wa.a.a(n.f).b(true);
   private int x;
   private int y;
   @Deprecated
   @Nullable
   private final cmm z;
   @Nullable
   private sl A;
   @Nullable
   private blp B;
   @Nullable
   private cjz C;
   @Nullable
   private cjz D;

   public Optional<cjx> a() {
      return this.d().h(this);
   }

   public cmr(cth $$0) {
      this($$0, 1);
   }

   public cmr(ih<cmm> $$0) {
      this($$0.a(), 1);
   }

   public cmr(ih<cmm> $$0, int $$1, Optional<sl> $$2) {
      this($$0, $$1);
      $$2.ifPresent(this::c);
   }

   public cmr(ih<cmm> $$0, int $$1) {
      this($$0.a(), $$1);
   }

   public cmr(cth $$0, int $$1) {
      this.z = $$0.k();
      this.x = $$1;
      if (this.z.o()) {
         this.b(this.k());
      }
   }

   private cmr(@Nullable Void $$0) {
      this.z = null;
   }

   private cmr(sl $$0) {
      this.z = kd.h.a(new ahd($$0.l("id")));
      this.x = $$0.f("Count");
      if ($$0.b("tag", 10)) {
         this.A = $$0.p("tag").h();
         this.d().b(this.A);
      }

      if (this.d().o()) {
         this.b(this.k());
      }
   }

   public static cmr a(sl $$0) {
      try {
         return new cmr($$0);
      } catch (RuntimeException var2) {
         o.debug("Tried to load invalid item: {}", $$0, var2);
         return f;
      }
   }

   public boolean b() {
      return this == f || this.z == cmu.a || this.x <= 0;
   }

   public boolean a(chl $$0) {
      return this.b() || this.d().a($$0);
   }

   public cmr a(int $$0) {
      int $$1 = Math.min($$0, this.L());
      cmr $$2 = this.c($$1);
      this.h($$1);
      return $$2;
   }

   public cmr c() {
      if (this.b()) {
         return f;
      } else {
         cmr $$0 = this.p();
         this.f(0);
         return $$0;
      }
   }

   public cmm d() {
      return this.b() ? cmu.a : this.z;
   }

   public ih<cmm> e() {
      return this.d().j();
   }

   public boolean a(asq<cmm> $$0) {
      return this.d().j().a($$0);
   }

   public boolean a(cmm $$0) {
      return this.d() == $$0;
   }

   public boolean a(Predicate<ih<cmm>> $$0) {
      return $$0.test(this.d().j());
   }

   public boolean a(ih<cmm> $$0) {
      return this.d().j() == $$0;
   }

   public boolean a(il<cmm> $$0) {
      return $$0.a(this.e());
   }

   public Stream<asq<cmm>> f() {
      return this.d().j().c();
   }

   public bjv a(cpc $$0) {
      cfb $$1 = $$0.o();
      hx $$2 = $$0.a();
      dje $$3 = new dje($$0.q(), $$2, false);
      if ($$1 != null && !$$1.fT().e && !this.a($$0.q().I_().d(ke.f), $$3)) {
         return bjv.d;
      } else {
         cmm $$4 = this.d();
         bjv $$5 = $$4.a($$0);
         if ($$1 != null && $$5.c()) {
            $$1.b(arw.c.b($$4));
         }

         return $$5;
      }
   }

   public float a(dja $$0) {
      return this.d().a(this, $$0);
   }

   public bjw<cmr> a(cti $$0, cfb $$1, bju $$2) {
      return this.d().a($$0, $$1, $$2);
   }

   public cmr a(cti $$0, bmf $$1) {
      return this.d().a(this, $$0, $$1);
   }

   public sl b(sl $$0) {
      ahd $$1 = kd.h.b(this.d());
      $$0.a("id", $$1 == null ? "minecraft:air" : $$1.toString());
      $$0.a("Count", (byte)this.x);
      if (this.A != null) {
         $$0.a("tag", this.A.h());
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
         sl $$0 = this.v();
         return $$0 == null || !$$0.q("Unbreakable");
      } else {
         return false;
      }
   }

   public boolean j() {
      return this.i() && this.k() > 0;
   }

   public int k() {
      return this.A == null ? 0 : this.A.h("Damage");
   }

   public void b(int $$0) {
      this.w().a("Damage", Math.max(0, $$0));
   }

   public int l() {
      return this.d().n();
   }

   public boolean a(int $$0, aup $$1, @Nullable ana $$2) {
      if (!this.i()) {
         return false;
      } else {
         if ($$0 > 0) {
            int $$3 = cre.a(crg.w, this);
            int $$4 = 0;

            for (int $$5 = 0; $$3 > 0 && $$5 < $$0; $$5++) {
               if (cra.a(this, $$3, $$1)) {
                  $$4++;
               }
            }

            $$0 -= $$4;
            if ($$0 <= 0) {
               return false;
            }
         }

         if ($$2 != null && $$0 != 0) {
            am.u.a($$2, this, this.k() + $$0);
         }

         int $$6 = this.k() + $$0;
         this.b($$6);
         return $$6 >= this.l();
      }
   }

   public <T extends bmf> void a(int $$0, T $$1, Consumer<T> $$2) {
      if (!$$1.dM().B && (!($$1 instanceof cfb) || !((cfb)$$1).fT().d)) {
         if (this.i()) {
            if (this.a($$0, $$1.eg(), $$1 instanceof ana ? (ana)$$1 : null)) {
               $$2.accept($$1);
               cmm $$3 = this.d();
               this.h(1);
               if ($$1 instanceof cfb) {
                  ((cfb)$$1).b(arw.d.b($$3));
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

   public boolean a(cjp $$0, cic $$1, cfb $$2) {
      return this.d().a(this, $$0, $$1, $$2);
   }

   public boolean a(cmr $$0, cjp $$1, cic $$2, cfb $$3, bmx $$4) {
      return this.d().a(this, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(bmf $$0, cfb $$1) {
      cmm $$2 = this.d();
      if ($$2.a(this, $$0, $$1)) {
         $$1.b(arw.c.b($$2));
      }
   }

   public void a(cti $$0, dja $$1, hx $$2, cfb $$3) {
      cmm $$4 = this.d();
      if ($$4.a(this, $$0, $$1, $$2, $$3)) {
         $$3.b(arw.c.b($$4));
      }
   }

   public boolean b(dja $$0) {
      return this.d().a_($$0);
   }

   public bjv a(cfb $$0, bmf $$1, bju $$2) {
      return this.d().a(this, $$0, $$1, $$2);
   }

   public cmr p() {
      if (this.b()) {
         return f;
      } else {
         cmr $$0 = new cmr(this.d(), this.x);
         $$0.e(this.K());
         if (this.A != null) {
            $$0.A = this.A.h();
         }

         return $$0;
      }
   }

   public cmr c(int $$0) {
      if (this.b()) {
         return f;
      } else {
         cmr $$1 = this.p();
         $$1.f($$0);
         return $$1;
      }
   }

   public static boolean a(cmr $$0, cmr $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return $$0.L() != $$1.L() ? false : c($$0, $$1);
      }
   }

   public static boolean b(cmr $$0, cmr $$1) {
      return $$0.a($$1.d());
   }

   public static boolean c(cmr $$0, cmr $$1) {
      if (!$$0.a($$1.d())) {
         return false;
      } else {
         return $$0.b() && $$1.b() ? true : Objects.equals($$0.A, $$1.A);
      }
   }

   public String q() {
      return this.d().j(this);
   }

   @Override
   public String toString() {
      return this.L() + " " + this.d();
   }

   public void a(cti $$0, blp $$1, int $$2, boolean $$3) {
      if (this.y > 0) {
         this.y--;
      }

      if (this.d() != null) {
         this.d().a(this, $$0, $$1, $$2, $$3);
      }
   }

   public void a(cti $$0, cfb $$1, int $$2) {
      $$1.a(arw.b.b(this.d()), $$2);
      this.d().b(this, $$0, $$1);
   }

   public void a(cti $$0) {
      this.d().a(this, $$0);
   }

   public int r() {
      return this.d().b(this);
   }

   public cok s() {
      return this.d().c(this);
   }

   public void a(cti $$0, bmf $$1, int $$2) {
      this.d().a(this, $$0, $$1, $$2);
   }

   public boolean t() {
      return this.d().l(this);
   }

   public boolean u() {
      return !this.b() && this.A != null && !this.A.g();
   }

   @Nullable
   public sl v() {
      return this.A;
   }

   public sl w() {
      if (this.A == null) {
         this.c(new sl());
      }

      return this.A;
   }

   public sl a(String $$0) {
      if (this.A != null && this.A.b($$0, 10)) {
         return this.A.p($$0);
      } else {
         sl $$1 = new sl();
         this.a($$0, $$1);
         return $$1;
      }
   }

   @Nullable
   public sl b(String $$0) {
      return this.A != null && this.A.b($$0, 10) ? this.A.p($$0) : null;
   }

   public void c(String $$0) {
      if (this.A != null && this.A.e($$0)) {
         this.A.r($$0);
         if (this.A.g()) {
            this.A = null;
         }
      }
   }

   public sr x() {
      return this.A != null ? this.A.c("Enchantments", 10) : new sr();
   }

   public void c(@Nullable sl $$0) {
      this.A = $$0;
      if (this.d().o()) {
         this.b(this.k());
      }

      if ($$0 != null) {
         this.d().b($$0);
      }
   }

   public vd y() {
      sl $$0 = this.b("display");
      if ($$0 != null && $$0.b("Name", 8)) {
         try {
            vd $$1 = vd.a.a($$0.l("Name"));
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

   public cmr a(@Nullable vd $$0) {
      sl $$1 = this.a("display");
      if ($$0 != null) {
         $$1.a("Name", vd.a.a($$0));
      } else {
         $$1.r("Name");
      }

      return this;
   }

   public void z() {
      sl $$0 = this.b("display");
      if ($$0 != null) {
         $$0.r("Name");
         if ($$0.g()) {
            this.c("display");
         }
      }

      if (this.A != null && this.A.g()) {
         this.A = null;
      }
   }

   public boolean A() {
      sl $$0 = this.b("display");
      return $$0 != null && $$0.b("Name", 8);
   }

   public List<vd> a(@Nullable cfb $$0, coi $$1) {
      List<vd> $$2 = Lists.newArrayList();
      vr $$3 = vd.i().b(this.y()).a(this.C().e);
      if (this.A()) {
         $$3.a(n.u);
      }

      $$2.add($$3);
      if (!$$1.a() && !this.A() && this.a(cmu.rR)) {
         Integer $$4 = cmy.d(this);
         if ($$4 != null) {
            $$2.add(cmy.k(this));
         }
      }

      int $$5 = this.P();
      if (a($$5, cmr.a.f)) {
         this.d().a(this, $$0 == null ? null : $$0.dM(), $$2, $$1);
      }

      if (this.u()) {
         if (a($$5, cmr.a.h) && $$0 != null) {
            cou.a(this, $$0.dM().I_(), $$2);
         }

         if (a($$5, cmr.a.a)) {
            a($$2, this.x());
         }

         if (this.A.b("display", 10)) {
            sl $$6 = this.A.p("display");
            if (a($$5, cmr.a.g) && $$6.b("color", 99)) {
               if ($$1.a()) {
                  $$2.add(vd.a("item.color", String.format(Locale.ROOT, "#%06X", $$6.h("color"))).a(n.h));
               } else {
                  $$2.add(vd.c("item.dyed").a(n.h, n.u));
               }
            }

            if ($$6.d("Lore") == 9) {
               sr $$7 = $$6.c("Lore", 8);

               for (int $$8 = 0; $$8 < $$7.size(); $$8++) {
                  String $$9 = $$7.j($$8);

                  try {
                     vr $$10 = vd.a.a($$9);
                     if ($$10 != null) {
                        $$2.add(vg.a($$10, w));
                     }
                  } catch (Exception var19) {
                     $$6.r("Lore");
                  }
               }
            }
         }
      }

      if (a($$5, cmr.a.b)) {
         for (blu $$12 : blu.values()) {
            Multimap<bng, bnj> $$13 = this.a($$12);
            if (!$$13.isEmpty()) {
               $$2.add(vc.a);
               $$2.add(vd.c("item.modifiers." + $$12.e()).a(n.h));

               for (Entry<bng, bnj> $$14 : $$13.entries()) {
                  bnj $$15 = $$14.getValue();
                  double $$16 = $$15.c();
                  boolean $$17 = false;
                  if ($$0 != null) {
                     if ($$15.a() == cmm.m) {
                        $$16 += $$0.c(bnl.c);
                        $$16 += (double)cre.a(this, bmk.a);
                        $$17 = true;
                     } else if ($$15.a() == cmm.n) {
                        $$16 += $$0.c(bnl.e);
                        $$17 = true;
                     }
                  }

                  double $$18;
                  if ($$15.b() == bnj.a.b || $$15.b() == bnj.a.c) {
                     $$18 = $$16 * 100.0;
                  } else if ($$14.getKey().equals(bnl.i)) {
                     $$18 = $$16 * 10.0;
                  } else {
                     $$18 = $$16;
                  }

                  if ($$17) {
                     $$2.add(vc.a().b(vd.a("attribute.modifier.equals." + $$15.b().a(), g.format($$18), vd.c($$14.getKey().c()))).a(n.c));
                  } else if ($$16 > 0.0) {
                     $$2.add(vd.a("attribute.modifier.plus." + $$15.b().a(), g.format($$18), vd.c($$14.getKey().c())).a(n.j));
                  } else if ($$16 < 0.0) {
                     $$18 *= -1.0;
                     $$2.add(vd.a("attribute.modifier.take." + $$15.b().a(), g.format($$18), vd.c($$14.getKey().c())).a(n.m));
                  }
               }
            }
         }
      }

      if (this.u()) {
         if (a($$5, cmr.a.c) && this.A.q("Unbreakable")) {
            $$2.add(vd.c("item.unbreakable").a(n.j));
         }

         if (a($$5, cmr.a.d) && this.A.b("CanDestroy", 9)) {
            sr $$21 = this.A.c("CanDestroy", 8);
            if (!$$21.isEmpty()) {
               $$2.add(vc.a);
               $$2.add(vd.c("item.canBreak").a(n.h));

               for (int $$22 = 0; $$22 < $$21.size(); $$22++) {
                  $$2.addAll(d($$21.j($$22)));
               }
            }
         }

         if (a($$5, cmr.a.e) && this.A.b("CanPlaceOn", 9)) {
            sr $$23 = this.A.c("CanPlaceOn", 8);
            if (!$$23.isEmpty()) {
               $$2.add(vc.a);
               $$2.add(vd.c("item.canPlace").a(n.h));

               for (int $$24 = 0; $$24 < $$23.size(); $$24++) {
                  $$2.addAll(d($$23.j($$24)));
               }
            }
         }
      }

      if ($$1.a()) {
         if (this.j()) {
            $$2.add(vd.a("item.durability", this.l() - this.k(), this.l()));
         }

         $$2.add(vd.b(kd.h.b(this.d()).toString()).a(n.i));
         if (this.u()) {
            $$2.add(vd.a("item.nbt_tags", this.A.e().size()).a(n.i));
         }
      }

      if ($$0 != null && !this.d().a($$0.dM().I())) {
         $$2.add(u);
      }

      return $$2;
   }

   private static boolean a(int $$0, cmr.a $$1) {
      return ($$0 & $$1.a()) == 0;
   }

   private int P() {
      return this.u() && this.A.b("HideFlags", 99) ? this.A.h("HideFlags") : 0;
   }

   public void a(cmr.a $$0) {
      sl $$1 = this.w();
      $$1.a("HideFlags", $$1.h("HideFlags") | $$0.a());
   }

   public static void a(List<vd> $$0, sr $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         sl $$3 = $$1.a($$2);
         kd.f.b(cre.b($$3)).ifPresent($$2x -> $$0.add($$2x.d(cre.a($$3))));
      }
   }

   private static Collection<vd> d(String $$0) {
      try {
         return (Collection<vd>)fk.b(kd.e.p(), $$0, true)
            .map(
               $$0x -> Lists.newArrayList(new vd[]{$$0x.a().b().f().a(n.i)}),
               $$0x -> $$0x.a().a().map($$0xx -> ((cwj)$$0xx.a()).f().a(n.i)).collect(Collectors.toList())
            );
      } catch (CommandSyntaxException var2) {
         return Lists.newArrayList(new vd[]{vd.b("missingno").a(n.i)});
      }
   }

   public boolean B() {
      return this.d().i(this);
   }

   public cni C() {
      return this.d().n(this);
   }

   public boolean D() {
      return !this.d().d_(this) ? false : !this.E();
   }

   public void a(crc $$0, int $$1) {
      this.w();
      if (!this.A.b("Enchantments", 9)) {
         this.A.a("Enchantments", new sr());
      }

      sr $$2 = this.A.c("Enchantments", 10);
      $$2.add(cre.a(cre.a($$0), (byte)$$1));
   }

   public boolean E() {
      return this.A != null && this.A.b("Enchantments", 9) ? !this.A.c("Enchantments", 10).isEmpty() : false;
   }

   public void a(String $$0, ti $$1) {
      this.w().a($$0, $$1);
   }

   public boolean F() {
      return this.B instanceof cbh;
   }

   public void a(@Nullable blp $$0) {
      this.B = $$0;
   }

   @Nullable
   public cbh G() {
      return this.B instanceof cbh ? (cbh)this.H() : null;
   }

   @Nullable
   public blp H() {
      return !this.b() ? this.B : null;
   }

   public int I() {
      return this.u() && this.A.b("RepairCost", 3) ? this.A.h("RepairCost") : 0;
   }

   public void d(int $$0) {
      if ($$0 > 0) {
         this.w().a("RepairCost", $$0);
      } else {
         this.c("RepairCost");
      }
   }

   public Multimap<bng, bnj> a(blu $$0) {
      Multimap<bng, bnj> $$1;
      if (this.u() && this.A.b("AttributeModifiers", 9)) {
         $$1 = HashMultimap.create();
         sr $$2 = this.A.c("AttributeModifiers", 10);

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            sl $$4 = $$2.a($$3);
            if (!$$4.b("Slot", 8) || $$4.l("Slot").equals($$0.e())) {
               Optional<bng> $$5 = kd.u.b(ahd.a($$4.l("AttributeName")));
               if (!$$5.isEmpty()) {
                  bnj $$6 = bnj.a($$4);
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

   public void a(bng $$0, bnj $$1, @Nullable blu $$2) {
      this.w();
      if (!this.A.b("AttributeModifiers", 9)) {
         this.A.a("AttributeModifiers", new sr());
      }

      sr $$3 = this.A.c("AttributeModifiers", 10);
      sl $$4 = $$1.d();
      $$4.a("AttributeName", kd.u.b($$0).toString());
      if ($$2 != null) {
         $$4.a("Slot", $$2.e());
      }

      $$3.add($$4);
   }

   public vd J() {
      vr $$0 = vd.i().b(this.y());
      if (this.A()) {
         $$0.a(n.u);
      }

      vr $$1 = vg.a((vd)$$0);
      if (!this.b()) {
         $$1.a(this.C().e).a($$0x -> $$0x.a(new vj(vj.a.b, new vj.c(this))));
      }

      return $$1;
   }

   public boolean a(it<cwj> $$0, dje $$1) {
      if (this.D == null) {
         this.D = new cjz("CanPlaceOn");
      }

      return this.D.a(this, $$0, $$1);
   }

   public boolean b(it<cwj> $$0, dje $$1) {
      if (this.C == null) {
         this.C = new cjz("CanDestroy");
      }

      return this.C.a(this, $$0, $$1);
   }

   public int K() {
      return this.y;
   }

   public void e(int $$0) {
      this.y = $$0;
   }

   public int L() {
      return this.b() ? 0 : this.x;
   }

   public void f(int $$0) {
      this.x = $$0;
   }

   public void g(int $$0) {
      this.f(this.L() + $$0);
   }

   public void h(int $$0) {
      this.g(-$$0);
   }

   public void b(cti $$0, bmf $$1, int $$2) {
      this.d().a($$0, $$1, this, $$2);
   }

   public void a(cbo $$0) {
      this.d().a($$0);
   }

   public boolean M() {
      return this.d().u();
   }

   public arl N() {
      return this.d().an_();
   }

   public arl O() {
      return this.d().ao_();
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
