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

public final class cng {
   public static final Codec<cng> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               kd.h.r().fieldOf("id").forGetter(cng::e),
               Codec.INT.fieldOf("Count").forGetter(cng::L),
               so.a.optionalFieldOf("tag").forGetter($$0x -> Optional.ofNullable($$0x.v()))
            )
            .apply($$0, cng::new)
   );
   private static final Codec<cnb> n = atx.a(
      kd.h.q(), (Function<cnb, DataResult<cnb>>)($$0 -> $$0 == cnj.a ? DataResult.error(() -> "Item must not be minecraft:air") : DataResult.success($$0))
   );
   public static final Codec<cng> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(kd.h.r().fieldOf("item").forGetter(cng::e), atx.a(tm.i, "nbt").forGetter($$0x -> Optional.ofNullable($$0x.v())))
            .apply($$0, ($$0x, $$1) -> new cng($$0x, 1, $$1))
   );
   public static final Codec<cng> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(n.fieldOf("item").forGetter(cng::d), atx.a(atx.j, "count", Integer.valueOf(1)).forGetter(cng::L)).apply($$0, cng::new)
   );
   public static final Codec<cng> d = n.xmap(cng::new, cng::d);
   public static final MapCodec<cng> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kd.h.q().fieldOf("result").forGetter(cng::d), Codec.INT.fieldOf("count").forGetter(cng::L)).apply($$0, cng::new)
   );
   private static final Logger o = LogUtils.getLogger();
   public static final cng f = new cng((Void)null);
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
   private static final vg u = vg.c("item.disabled").a(n.m);
   private static final int v = 0;
   private static final wd w = wd.a.a(n.f).b(true);
   private int x;
   private int y;
   @Deprecated
   @Nullable
   private final cnb z;
   @Nullable
   private so A;
   @Nullable
   private blw B;
   @Nullable
   private cko C;
   @Nullable
   private cko D;

   public Optional<ckm> a() {
      return this.d().h(this);
   }

   public cng(ctw $$0) {
      this($$0, 1);
   }

   public cng(ih<cnb> $$0) {
      this($$0.a(), 1);
   }

   public cng(ih<cnb> $$0, int $$1, Optional<so> $$2) {
      this($$0, $$1);
      $$2.ifPresent(this::c);
   }

   public cng(ih<cnb> $$0, int $$1) {
      this($$0.a(), $$1);
   }

   public cng(ctw $$0, int $$1) {
      this.z = $$0.j();
      this.x = $$1;
      if (this.z.n()) {
         this.b(this.k());
      }
   }

   private cng(@Nullable Void $$0) {
      this.z = null;
   }

   private cng(so $$0) {
      this.z = kd.h.a(new ahh($$0.l("id")));
      this.x = $$0.f("Count");
      if ($$0.b("tag", 10)) {
         this.A = $$0.p("tag").h();
         this.d().b(this.A);
      }

      if (this.d().n()) {
         this.b(this.k());
      }
   }

   public static cng a(so $$0) {
      try {
         return new cng($$0);
      } catch (RuntimeException var2) {
         o.debug("Tried to load invalid item: {}", $$0, var2);
         return f;
      }
   }

   public boolean b() {
      return this == f || this.z == cnj.a || this.x <= 0;
   }

   public boolean a(cia $$0) {
      return this.b() || this.d().a($$0);
   }

   public cng a(int $$0) {
      int $$1 = Math.min($$0, this.L());
      cng $$2 = this.c($$1);
      this.h($$1);
      return $$2;
   }

   public cng c() {
      if (this.b()) {
         return f;
      } else {
         cng $$0 = this.p();
         this.f(0);
         return $$0;
      }
   }

   public cnb d() {
      return this.b() ? cnj.a : this.z;
   }

   public ih<cnb> e() {
      return this.d().i();
   }

   public boolean a(asx<cnb> $$0) {
      return this.d().i().a($$0);
   }

   public boolean a(cnb $$0) {
      return this.d() == $$0;
   }

   public boolean a(Predicate<ih<cnb>> $$0) {
      return $$0.test(this.d().i());
   }

   public boolean a(ih<cnb> $$0) {
      return this.d().i() == $$0;
   }

   public boolean a(il<cnb> $$0) {
      return $$0.a(this.e());
   }

   public Stream<asx<cnb>> f() {
      return this.d().i().c();
   }

   public bkc a(cpr $$0) {
      cfq $$1 = $$0.o();
      hx $$2 = $$0.a();
      djt $$3 = new djt($$0.q(), $$2, false);
      if ($$1 != null && !$$1.fT().e && !this.a($$0.q().I_().d(ke.f), $$3)) {
         return bkc.d;
      } else {
         cnb $$4 = this.d();
         bkc $$5 = $$4.a($$0);
         if ($$1 != null && $$5.c()) {
            $$1.b(asd.c.b($$4));
         }

         return $$5;
      }
   }

   public float a(djp $$0) {
      return this.d().a(this, $$0);
   }

   public bkd<cng> a(ctx $$0, cfq $$1, bkb $$2) {
      return this.d().a($$0, $$1, $$2);
   }

   public cng a(ctx $$0, bmo $$1) {
      return this.d().a(this, $$0, $$1);
   }

   public so b(so $$0) {
      ahh $$1 = kd.h.b(this.d());
      $$0.a("id", $$1 == null ? "minecraft:air" : $$1.toString());
      $$0.a("Count", (byte)this.x);
      if (this.A != null) {
         $$0.a("tag", this.A.h());
      }

      return $$0;
   }

   public int g() {
      return this.d().k();
   }

   public boolean h() {
      return this.g() > 1 && (!this.i() || !this.j());
   }

   public boolean i() {
      if (!this.b() && this.d().l() > 0) {
         so $$0 = this.v();
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
      return this.d().l();
   }

   public boolean a(int $$0, auw $$1, @Nullable anf $$2) {
      if (!this.i()) {
         return false;
      } else {
         if ($$0 > 0) {
            int $$3 = crt.a(crv.w, this);
            int $$4 = 0;

            for (int $$5 = 0; $$3 > 0 && $$5 < $$0; $$5++) {
               if (crp.a(this, $$3, $$1)) {
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

   public <T extends bmo> void a(int $$0, T $$1, Consumer<T> $$2) {
      if (!$$1.dL().B && (!($$1 instanceof cfq) || !((cfq)$$1).fT().d)) {
         if (this.i()) {
            if (this.a($$0, $$1.eg(), $$1 instanceof anf ? (anf)$$1 : null)) {
               $$2.accept($$1);
               cnb $$3 = this.d();
               this.h(1);
               if ($$1 instanceof cfq) {
                  ((cfq)$$1).b(asd.d.b($$3));
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

   public boolean a(cke $$0, cir $$1, cfq $$2) {
      return this.d().a(this, $$0, $$1, $$2);
   }

   public boolean a(cng $$0, cke $$1, cir $$2, cfq $$3, bng $$4) {
      return this.d().a(this, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(bmo $$0, cfq $$1) {
      cnb $$2 = this.d();
      if ($$2.a(this, $$0, $$1)) {
         $$1.b(asd.c.b($$2));
      }
   }

   public void a(ctx $$0, djp $$1, hx $$2, cfq $$3) {
      cnb $$4 = this.d();
      if ($$4.a(this, $$0, $$1, $$2, $$3)) {
         $$3.b(asd.c.b($$4));
      }
   }

   public boolean b(djp $$0) {
      return this.d().a_($$0);
   }

   public bkc a(cfq $$0, bmo $$1, bkb $$2) {
      return this.d().a(this, $$0, $$1, $$2);
   }

   public cng p() {
      if (this.b()) {
         return f;
      } else {
         cng $$0 = new cng(this.d(), this.x);
         $$0.e(this.K());
         if (this.A != null) {
            $$0.A = this.A.h();
         }

         return $$0;
      }
   }

   public cng c(int $$0) {
      if (this.b()) {
         return f;
      } else {
         cng $$1 = this.p();
         $$1.f($$0);
         return $$1;
      }
   }

   public static boolean a(cng $$0, cng $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return $$0.L() != $$1.L() ? false : c($$0, $$1);
      }
   }

   public static boolean b(cng $$0, cng $$1) {
      return $$0.a($$1.d());
   }

   public static boolean c(cng $$0, cng $$1) {
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

   public void a(ctx $$0, blw $$1, int $$2, boolean $$3) {
      if (this.y > 0) {
         this.y--;
      }

      if (this.d() != null) {
         this.d().a(this, $$0, $$1, $$2, $$3);
      }
   }

   public void a(ctx $$0, cfq $$1, int $$2) {
      $$1.a(asd.b.b(this.d()), $$2);
      this.d().b(this, $$0, $$1);
   }

   public void a(ctx $$0) {
      this.d().a(this, $$0);
   }

   public int r() {
      return this.d().b(this);
   }

   public cpa s() {
      return this.d().c(this);
   }

   public void a(ctx $$0, bmo $$1, int $$2) {
      this.d().a(this, $$0, $$1, $$2);
   }

   public boolean t() {
      return this.d().l(this);
   }

   public boolean u() {
      return !this.b() && this.A != null && !this.A.g();
   }

   @Nullable
   public so v() {
      return this.A;
   }

   public so w() {
      if (this.A == null) {
         this.c(new so());
      }

      return this.A;
   }

   public so a(String $$0) {
      if (this.A != null && this.A.b($$0, 10)) {
         return this.A.p($$0);
      } else {
         so $$1 = new so();
         this.a($$0, $$1);
         return $$1;
      }
   }

   @Nullable
   public so b(String $$0) {
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

   public su x() {
      return this.A != null ? this.A.c("Enchantments", 10) : new su();
   }

   public void c(@Nullable so $$0) {
      this.A = $$0;
      if (this.d().n()) {
         this.b(this.k());
      }

      if ($$0 != null) {
         this.d().b($$0);
      }
   }

   public vg y() {
      so $$0 = this.b("display");
      if ($$0 != null && $$0.b("Name", 8)) {
         try {
            vg $$1 = vg.a.a($$0.l("Name"));
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

   public cng a(@Nullable vg $$0) {
      so $$1 = this.a("display");
      if ($$0 != null) {
         $$1.a("Name", vg.a.a($$0));
      } else {
         $$1.r("Name");
      }

      return this;
   }

   public void z() {
      so $$0 = this.b("display");
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
      so $$0 = this.b("display");
      return $$0 != null && $$0.b("Name", 8);
   }

   public List<vg> a(@Nullable cfq $$0, coy $$1) {
      List<vg> $$2 = Lists.newArrayList();
      vu $$3 = vg.i().b(this.y()).a(this.C().e);
      if (this.A()) {
         $$3.a(n.u);
      }

      $$2.add($$3);
      if (!$$1.a() && !this.A() && this.a(cnj.rT)) {
         Integer $$4 = cnn.d(this);
         if ($$4 != null) {
            $$2.add(cnn.k(this));
         }
      }

      int $$5 = this.P();
      if (a($$5, cng.a.f)) {
         this.d().a(this, $$0 == null ? null : $$0.dL(), $$2, $$1);
      }

      if (this.u()) {
         if (a($$5, cng.a.h) && $$0 != null) {
            cpj.a(this, $$0.dL().I_(), $$2);
         }

         if (a($$5, cng.a.a)) {
            a($$2, this.x());
         }

         if (this.A.b("display", 10)) {
            so $$6 = this.A.p("display");
            if (a($$5, cng.a.g) && $$6.b("color", 99)) {
               if ($$1.a()) {
                  $$2.add(vg.a("item.color", String.format(Locale.ROOT, "#%06X", $$6.h("color"))).a(n.h));
               } else {
                  $$2.add(vg.c("item.dyed").a(n.h, n.u));
               }
            }

            if ($$6.d("Lore") == 9) {
               su $$7 = $$6.c("Lore", 8);

               for (int $$8 = 0; $$8 < $$7.size(); $$8++) {
                  String $$9 = $$7.j($$8);

                  try {
                     vu $$10 = vg.a.a($$9);
                     if ($$10 != null) {
                        $$2.add(vj.a($$10, w));
                     }
                  } catch (Exception var19) {
                     $$6.r("Lore");
                  }
               }
            }
         }
      }

      if (a($$5, cng.a.b)) {
         for (bmd $$12 : bmd.values()) {
            Multimap<ih<bnp>, bns> $$13 = this.a($$12);
            if (!$$13.isEmpty()) {
               $$2.add(vf.a);
               $$2.add(vg.c("item.modifiers." + $$12.e()).a(n.h));

               for (Entry<ih<bnp>, bns> $$14 : $$13.entries()) {
                  bns $$15 = $$14.getValue();
                  double $$16 = $$15.c();
                  boolean $$17 = false;
                  if ($$0 != null) {
                     if ($$15.a() == cnb.m) {
                        $$16 += $$0.h(bnu.c);
                        $$16 += (double)crt.a(this, bmt.a);
                        $$17 = true;
                     } else if ($$15.a() == cnb.n) {
                        $$16 += $$0.h(bnu.e);
                        $$17 = true;
                     }
                  }

                  double $$18;
                  if ($$15.b() == bns.a.b || $$15.b() == bns.a.c) {
                     $$18 = $$16 * 100.0;
                  } else if ($$14.getKey().a(bnu.k)) {
                     $$18 = $$16 * 10.0;
                  } else {
                     $$18 = $$16;
                  }

                  if ($$17) {
                     $$2.add(vf.a().b(vg.a("attribute.modifier.equals." + $$15.b().a(), g.format($$18), vg.c($$14.getKey().a().c()))).a(n.c));
                  } else if ($$16 > 0.0) {
                     $$2.add(vg.a("attribute.modifier.plus." + $$15.b().a(), g.format($$18), vg.c($$14.getKey().a().c())).a(n.j));
                  } else if ($$16 < 0.0) {
                     $$18 *= -1.0;
                     $$2.add(vg.a("attribute.modifier.take." + $$15.b().a(), g.format($$18), vg.c($$14.getKey().a().c())).a(n.m));
                  }
               }
            }
         }
      }

      if (this.u()) {
         if (a($$5, cng.a.c) && this.A.q("Unbreakable")) {
            $$2.add(vg.c("item.unbreakable").a(n.j));
         }

         if (a($$5, cng.a.d) && this.A.b("CanDestroy", 9)) {
            su $$21 = this.A.c("CanDestroy", 8);
            if (!$$21.isEmpty()) {
               $$2.add(vf.a);
               $$2.add(vg.c("item.canBreak").a(n.h));

               for (int $$22 = 0; $$22 < $$21.size(); $$22++) {
                  $$2.addAll(d($$21.j($$22)));
               }
            }
         }

         if (a($$5, cng.a.e) && this.A.b("CanPlaceOn", 9)) {
            su $$23 = this.A.c("CanPlaceOn", 8);
            if (!$$23.isEmpty()) {
               $$2.add(vf.a);
               $$2.add(vg.c("item.canPlace").a(n.h));

               for (int $$24 = 0; $$24 < $$23.size(); $$24++) {
                  $$2.addAll(d($$23.j($$24)));
               }
            }
         }
      }

      if ($$1.a()) {
         if (this.j()) {
            $$2.add(vg.a("item.durability", this.l() - this.k(), this.l()));
         }

         $$2.add(vg.b(kd.h.b(this.d()).toString()).a(n.i));
         if (this.u()) {
            $$2.add(vg.a("item.nbt_tags", this.A.e().size()).a(n.i));
         }
      }

      if ($$0 != null && !this.d().a($$0.dL().I())) {
         $$2.add(u);
      }

      return $$2;
   }

   private static boolean a(int $$0, cng.a $$1) {
      return ($$0 & $$1.a()) == 0;
   }

   private int P() {
      return this.u() && this.A.b("HideFlags", 99) ? this.A.h("HideFlags") : 0;
   }

   public void a(cng.a $$0) {
      so $$1 = this.w();
      $$1.a("HideFlags", $$1.h("HideFlags") | $$0.a());
   }

   public static void a(List<vg> $$0, su $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         so $$3 = $$1.a($$2);
         kd.f.b(crt.b($$3)).ifPresent($$2x -> $$0.add($$2x.d(crt.a($$3))));
      }
   }

   private static Collection<vg> d(String $$0) {
      try {
         return (Collection<vg>)fk.b(kd.e.p(), $$0, true)
            .map(
               $$0x -> Lists.newArrayList(new vg[]{$$0x.a().b().f().a(n.i)}),
               $$0x -> $$0x.a().a().map($$0xx -> ((cwy)$$0xx.a()).f().a(n.i)).collect(Collectors.toList())
            );
      } catch (CommandSyntaxException var2) {
         return Lists.newArrayList(new vg[]{vg.b("missingno").a(n.i)});
      }
   }

   public boolean B() {
      return this.d().i(this);
   }

   public cnx C() {
      return this.d().n(this);
   }

   public boolean D() {
      return !this.d().d_(this) ? false : !this.E();
   }

   public void a(crr $$0, int $$1) {
      this.w();
      if (!this.A.b("Enchantments", 9)) {
         this.A.a("Enchantments", new su());
      }

      su $$2 = this.A.c("Enchantments", 10);
      $$2.add(crt.a(crt.a($$0), (byte)$$1));
   }

   public boolean E() {
      return this.A != null && this.A.b("Enchantments", 9) ? !this.A.c("Enchantments", 10).isEmpty() : false;
   }

   public void a(String $$0, tl $$1) {
      this.w().a($$0, $$1);
   }

   public boolean F() {
      return this.B instanceof cbu;
   }

   public void a(@Nullable blw $$0) {
      this.B = $$0;
   }

   @Nullable
   public cbu G() {
      return this.B instanceof cbu ? (cbu)this.H() : null;
   }

   @Nullable
   public blw H() {
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

   public Multimap<ih<bnp>, bns> a(bmd $$0) {
      Multimap<ih<bnp>, bns> $$1;
      if (this.u() && this.A.b("AttributeModifiers", 9)) {
         $$1 = HashMultimap.create();
         su $$2 = this.A.c("AttributeModifiers", 10);

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            so $$4 = $$2.a($$3);
            if (!$$4.b("Slot", 8) || $$4.l("Slot").equals($$0.e())) {
               ahh $$5 = ahh.a($$4.l("AttributeName"));
               if ($$5 != null) {
                  Optional<ih.c<bnp>> $$6 = kd.u.c($$5);
                  if (!$$6.isEmpty()) {
                     bns $$7 = bns.a($$4);
                     if ($$7 != null && $$7.a().getLeastSignificantBits() != 0L && $$7.a().getMostSignificantBits() != 0L) {
                        $$1.put($$6.get(), $$7);
                     }
                  }
               }
            }
         }
      } else {
         $$1 = this.d().a($$0);
      }

      return $$1;
   }

   public void a(ih<bnp> $$0, bns $$1, @Nullable bmd $$2) {
      this.w();
      if (!this.A.b("AttributeModifiers", 9)) {
         this.A.a("AttributeModifiers", new su());
      }

      su $$3 = this.A.c("AttributeModifiers", 10);
      so $$4 = $$1.d();
      $$4.a("AttributeName", $$0.e().orElseThrow(() -> new IllegalArgumentException("Cannot add unregistered attribute")).a().toString());
      if ($$2 != null) {
         $$4.a("Slot", $$2.e());
      }

      $$3.add($$4);
   }

   public vg J() {
      vu $$0 = vg.i().b(this.y());
      if (this.A()) {
         $$0.a(n.u);
      }

      vu $$1 = vj.a((vg)$$0);
      if (!this.b()) {
         $$1.a(this.C().e).a($$0x -> $$0x.a(new vm(vm.a.b, new vm.c(this))));
      }

      return $$1;
   }

   public boolean a(it<cwy> $$0, djt $$1) {
      if (this.D == null) {
         this.D = new cko("CanPlaceOn");
      }

      return this.D.a(this, $$0, $$1);
   }

   public boolean b(it<cwy> $$0, djt $$1) {
      if (this.C == null) {
         this.C = new cko("CanDestroy");
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

   public void b(ctx $$0, bmo $$1, int $$2) {
      this.d().a($$0, $$1, this, $$2);
   }

   public void a(ccb $$0) {
      this.d().a($$0);
   }

   public boolean M() {
      return this.d().t();
   }

   public ars N() {
      return this.d().ap_();
   }

   public ars O() {
      return this.d().aq_();
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
