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

public final class cmh {
   public static final Codec<cmh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               kb.h.r().fieldOf("id").forGetter(cmh::e),
               Codec.INT.fieldOf("Count").forGetter(cmh::L),
               sj.a.optionalFieldOf("tag").forGetter($$0x -> Optional.ofNullable($$0x.v()))
            )
            .apply($$0, cmh::new)
   );
   private static final Codec<cmc> n = atg.a(
      kb.h.q(), (Function<cmc, DataResult<cmc>>)($$0 -> $$0 == cmk.a ? DataResult.error(() -> "Item must not be minecraft:air") : DataResult.success($$0))
   );
   public static final Codec<cmh> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(kb.h.r().fieldOf("item").forGetter(cmh::e), atg.a(th.i, "nbt").forGetter($$0x -> Optional.ofNullable($$0x.v())))
            .apply($$0, ($$0x, $$1) -> new cmh($$0x, 1, $$1))
   );
   public static final Codec<cmh> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(n.fieldOf("item").forGetter(cmh::d), atg.a(atg.j, "count", Integer.valueOf(1)).forGetter(cmh::L)).apply($$0, cmh::new)
   );
   public static final Codec<cmh> d = n.xmap(cmh::new, cmh::d);
   public static final MapCodec<cmh> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kb.h.q().fieldOf("result").forGetter(cmh::d), Codec.INT.fieldOf("count").forGetter(cmh::L)).apply($$0, cmh::new)
   );
   private static final Logger o = LogUtils.getLogger();
   public static final cmh f = new cmh((Void)null);
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
   private static final vb u = vb.c("item.disabled").a(n.m);
   private static final int v = 0;
   private static final vy w = vy.a.a(n.f).b(true);
   private int x;
   private int y;
   @Deprecated
   @Nullable
   private final cmc z;
   @Nullable
   private sj A;
   @Nullable
   private blf B;
   @Nullable
   private cjp C;
   @Nullable
   private cjp D;

   public Optional<cjn> a() {
      return this.d().h(this);
   }

   public cmh(csx $$0) {
      this($$0, 1);
   }

   public cmh(ie<cmc> $$0) {
      this($$0.a(), 1);
   }

   public cmh(ie<cmc> $$0, int $$1, Optional<sj> $$2) {
      this($$0, $$1);
      $$2.ifPresent(this::c);
   }

   public cmh(ie<cmc> $$0, int $$1) {
      this($$0.a(), $$1);
   }

   public cmh(csx $$0, int $$1) {
      this.z = $$0.k();
      this.x = $$1;
      if (this.z.o()) {
         this.b(this.k());
      }
   }

   private cmh(@Nullable Void $$0) {
      this.z = null;
   }

   private cmh(sj $$0) {
      this.z = kb.h.a(new agt($$0.l("id")));
      this.x = $$0.f("Count");
      if ($$0.b("tag", 10)) {
         this.A = $$0.p("tag").h();
         this.d().b(this.A);
      }

      if (this.d().o()) {
         this.b(this.k());
      }
   }

   public static cmh a(sj $$0) {
      try {
         return new cmh($$0);
      } catch (RuntimeException var2) {
         o.debug("Tried to load invalid item: {}", $$0, var2);
         return f;
      }
   }

   public boolean b() {
      return this == f || this.z == cmk.a || this.x <= 0;
   }

   public boolean a(chb $$0) {
      return this.b() || this.d().a($$0);
   }

   public cmh a(int $$0) {
      int $$1 = Math.min($$0, this.L());
      cmh $$2 = this.c($$1);
      this.h($$1);
      return $$2;
   }

   public cmh c() {
      if (this.b()) {
         return f;
      } else {
         cmh $$0 = this.p();
         this.f(0);
         return $$0;
      }
   }

   public cmc d() {
      return this.b() ? cmk.a : this.z;
   }

   public ie<cmc> e() {
      return this.d().j();
   }

   public boolean a(asg<cmc> $$0) {
      return this.d().j().a($$0);
   }

   public boolean a(cmc $$0) {
      return this.d() == $$0;
   }

   public boolean a(Predicate<ie<cmc>> $$0) {
      return $$0.test(this.d().j());
   }

   public boolean a(ie<cmc> $$0) {
      return this.d().j() == $$0;
   }

   public boolean a(ij<cmc> $$0) {
      return $$0.a(this.e());
   }

   public Stream<asg<cmc>> f() {
      return this.d().j().c();
   }

   public bjl a(cos $$0) {
      cer $$1 = $$0.o();
      hv $$2 = $$0.a();
      dit $$3 = new dit($$0.q(), $$2, false);
      if ($$1 != null && !$$1.fT().e && !this.a($$0.q().I_().d(kc.f), $$3)) {
         return bjl.d;
      } else {
         cmc $$4 = this.d();
         bjl $$5 = $$4.a($$0);
         if ($$1 != null && $$5.c()) {
            $$1.b(arm.c.b($$4));
         }

         return $$5;
      }
   }

   public float a(dip $$0) {
      return this.d().a(this, $$0);
   }

   public bjm<cmh> a(csy $$0, cer $$1, bjk $$2) {
      return this.d().a($$0, $$1, $$2);
   }

   public cmh a(csy $$0, blv $$1) {
      return this.d().a(this, $$0, $$1);
   }

   public sj b(sj $$0) {
      agt $$1 = kb.h.b(this.d());
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
         sj $$0 = this.v();
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

   public boolean a(int $$0, auf $$1, @Nullable amq $$2) {
      if (!this.i()) {
         return false;
      } else {
         if ($$0 > 0) {
            int $$3 = cqu.a(cqw.w, this);
            int $$4 = 0;

            for (int $$5 = 0; $$3 > 0 && $$5 < $$0; $$5++) {
               if (cqq.a(this, $$3, $$1)) {
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

   public <T extends blv> void a(int $$0, T $$1, Consumer<T> $$2) {
      if (!$$1.dM().B && (!($$1 instanceof cer) || !((cer)$$1).fT().d)) {
         if (this.i()) {
            if (this.a($$0, $$1.eg(), $$1 instanceof amq ? (amq)$$1 : null)) {
               $$2.accept($$1);
               cmc $$3 = this.d();
               this.h(1);
               if ($$1 instanceof cer) {
                  ((cer)$$1).b(arm.d.b($$3));
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

   public boolean a(cjf $$0, chs $$1, cer $$2) {
      return this.d().a(this, $$0, $$1, $$2);
   }

   public boolean a(cmh $$0, cjf $$1, chs $$2, cer $$3, bmn $$4) {
      return this.d().a(this, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(blv $$0, cer $$1) {
      cmc $$2 = this.d();
      if ($$2.a(this, $$0, $$1)) {
         $$1.b(arm.c.b($$2));
      }
   }

   public void a(csy $$0, dip $$1, hv $$2, cer $$3) {
      cmc $$4 = this.d();
      if ($$4.a(this, $$0, $$1, $$2, $$3)) {
         $$3.b(arm.c.b($$4));
      }
   }

   public boolean b(dip $$0) {
      return this.d().a_($$0);
   }

   public bjl a(cer $$0, blv $$1, bjk $$2) {
      return this.d().a(this, $$0, $$1, $$2);
   }

   public cmh p() {
      if (this.b()) {
         return f;
      } else {
         cmh $$0 = new cmh(this.d(), this.x);
         $$0.e(this.K());
         if (this.A != null) {
            $$0.A = this.A.h();
         }

         return $$0;
      }
   }

   public cmh c(int $$0) {
      if (this.b()) {
         return f;
      } else {
         cmh $$1 = this.p();
         $$1.f($$0);
         return $$1;
      }
   }

   public static boolean a(cmh $$0, cmh $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return $$0.L() != $$1.L() ? false : c($$0, $$1);
      }
   }

   public static boolean b(cmh $$0, cmh $$1) {
      return $$0.a($$1.d());
   }

   public static boolean c(cmh $$0, cmh $$1) {
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

   public void a(csy $$0, blf $$1, int $$2, boolean $$3) {
      if (this.y > 0) {
         this.y--;
      }

      if (this.d() != null) {
         this.d().a(this, $$0, $$1, $$2, $$3);
      }
   }

   public void a(csy $$0, cer $$1, int $$2) {
      $$1.a(arm.b.b(this.d()), $$2);
      this.d().b(this, $$0, $$1);
   }

   public void a(csy $$0) {
      this.d().a(this, $$0);
   }

   public int r() {
      return this.d().b(this);
   }

   public coa s() {
      return this.d().c(this);
   }

   public void a(csy $$0, blv $$1, int $$2) {
      this.d().a(this, $$0, $$1, $$2);
   }

   public boolean t() {
      return this.d().l(this);
   }

   public boolean u() {
      return !this.b() && this.A != null && !this.A.g();
   }

   @Nullable
   public sj v() {
      return this.A;
   }

   public sj w() {
      if (this.A == null) {
         this.c(new sj());
      }

      return this.A;
   }

   public sj a(String $$0) {
      if (this.A != null && this.A.b($$0, 10)) {
         return this.A.p($$0);
      } else {
         sj $$1 = new sj();
         this.a($$0, $$1);
         return $$1;
      }
   }

   @Nullable
   public sj b(String $$0) {
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

   public sp x() {
      return this.A != null ? this.A.c("Enchantments", 10) : new sp();
   }

   public void c(@Nullable sj $$0) {
      this.A = $$0;
      if (this.d().o()) {
         this.b(this.k());
      }

      if ($$0 != null) {
         this.d().b($$0);
      }
   }

   public vb y() {
      sj $$0 = this.b("display");
      if ($$0 != null && $$0.b("Name", 8)) {
         try {
            vb $$1 = vb.a.a($$0.l("Name"));
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

   public cmh a(@Nullable vb $$0) {
      sj $$1 = this.a("display");
      if ($$0 != null) {
         $$1.a("Name", vb.a.a($$0));
      } else {
         $$1.r("Name");
      }

      return this;
   }

   public void z() {
      sj $$0 = this.b("display");
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
      sj $$0 = this.b("display");
      return $$0 != null && $$0.b("Name", 8);
   }

   public List<vb> a(@Nullable cer $$0, cny $$1) {
      List<vb> $$2 = Lists.newArrayList();
      vp $$3 = vb.i().b(this.y()).a(this.C().e);
      if (this.A()) {
         $$3.a(n.u);
      }

      $$2.add($$3);
      if (!$$1.a() && !this.A() && this.a(cmk.rR)) {
         Integer $$4 = cmo.d(this);
         if ($$4 != null) {
            $$2.add(cmo.k(this));
         }
      }

      int $$5 = this.P();
      if (a($$5, cmh.a.f)) {
         this.d().a(this, $$0 == null ? null : $$0.dM(), $$2, $$1);
      }

      if (this.u()) {
         if (a($$5, cmh.a.h) && $$0 != null) {
            coj.a(this, $$0.dM().I_(), $$2);
         }

         if (a($$5, cmh.a.a)) {
            a($$2, this.x());
         }

         if (this.A.b("display", 10)) {
            sj $$6 = this.A.p("display");
            if (a($$5, cmh.a.g) && $$6.b("color", 99)) {
               if ($$1.a()) {
                  $$2.add(vb.a("item.color", String.format(Locale.ROOT, "#%06X", $$6.h("color"))).a(n.h));
               } else {
                  $$2.add(vb.c("item.dyed").a(n.h, n.u));
               }
            }

            if ($$6.d("Lore") == 9) {
               sp $$7 = $$6.c("Lore", 8);

               for (int $$8 = 0; $$8 < $$7.size(); $$8++) {
                  String $$9 = $$7.j($$8);

                  try {
                     vp $$10 = vb.a.a($$9);
                     if ($$10 != null) {
                        $$2.add(ve.a($$10, w));
                     }
                  } catch (Exception var19) {
                     $$6.r("Lore");
                  }
               }
            }
         }
      }

      if (a($$5, cmh.a.b)) {
         for (blk $$12 : blk.values()) {
            Multimap<bmw, bmz> $$13 = this.a($$12);
            if (!$$13.isEmpty()) {
               $$2.add(va.a);
               $$2.add(vb.c("item.modifiers." + $$12.e()).a(n.h));

               for (Entry<bmw, bmz> $$14 : $$13.entries()) {
                  bmz $$15 = $$14.getValue();
                  double $$16 = $$15.c();
                  boolean $$17 = false;
                  if ($$0 != null) {
                     if ($$15.a() == cmc.m) {
                        $$16 += $$0.c(bnb.c);
                        $$16 += (double)cqu.a(this, bma.a);
                        $$17 = true;
                     } else if ($$15.a() == cmc.n) {
                        $$16 += $$0.c(bnb.e);
                        $$17 = true;
                     }
                  }

                  double $$18;
                  if ($$15.b() == bmz.a.b || $$15.b() == bmz.a.c) {
                     $$18 = $$16 * 100.0;
                  } else if ($$14.getKey().equals(bnb.i)) {
                     $$18 = $$16 * 10.0;
                  } else {
                     $$18 = $$16;
                  }

                  if ($$17) {
                     $$2.add(va.a().b(vb.a("attribute.modifier.equals." + $$15.b().a(), g.format($$18), vb.c($$14.getKey().c()))).a(n.c));
                  } else if ($$16 > 0.0) {
                     $$2.add(vb.a("attribute.modifier.plus." + $$15.b().a(), g.format($$18), vb.c($$14.getKey().c())).a(n.j));
                  } else if ($$16 < 0.0) {
                     $$18 *= -1.0;
                     $$2.add(vb.a("attribute.modifier.take." + $$15.b().a(), g.format($$18), vb.c($$14.getKey().c())).a(n.m));
                  }
               }
            }
         }
      }

      if (this.u()) {
         if (a($$5, cmh.a.c) && this.A.q("Unbreakable")) {
            $$2.add(vb.c("item.unbreakable").a(n.j));
         }

         if (a($$5, cmh.a.d) && this.A.b("CanDestroy", 9)) {
            sp $$21 = this.A.c("CanDestroy", 8);
            if (!$$21.isEmpty()) {
               $$2.add(va.a);
               $$2.add(vb.c("item.canBreak").a(n.h));

               for (int $$22 = 0; $$22 < $$21.size(); $$22++) {
                  $$2.addAll(d($$21.j($$22)));
               }
            }
         }

         if (a($$5, cmh.a.e) && this.A.b("CanPlaceOn", 9)) {
            sp $$23 = this.A.c("CanPlaceOn", 8);
            if (!$$23.isEmpty()) {
               $$2.add(va.a);
               $$2.add(vb.c("item.canPlace").a(n.h));

               for (int $$24 = 0; $$24 < $$23.size(); $$24++) {
                  $$2.addAll(d($$23.j($$24)));
               }
            }
         }
      }

      if ($$1.a()) {
         if (this.j()) {
            $$2.add(vb.a("item.durability", this.l() - this.k(), this.l()));
         }

         $$2.add(vb.b(kb.h.b(this.d()).toString()).a(n.i));
         if (this.u()) {
            $$2.add(vb.a("item.nbt_tags", this.A.e().size()).a(n.i));
         }
      }

      if ($$0 != null && !this.d().a($$0.dM().H())) {
         $$2.add(u);
      }

      return $$2;
   }

   private static boolean a(int $$0, cmh.a $$1) {
      return ($$0 & $$1.a()) == 0;
   }

   private int P() {
      return this.u() && this.A.b("HideFlags", 99) ? this.A.h("HideFlags") : 0;
   }

   public void a(cmh.a $$0) {
      sj $$1 = this.w();
      $$1.a("HideFlags", $$1.h("HideFlags") | $$0.a());
   }

   public static void a(List<vb> $$0, sp $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         sj $$3 = $$1.a($$2);
         kb.f.b(cqu.b($$3)).ifPresent($$2x -> $$0.add($$2x.d(cqu.a($$3))));
      }
   }

   private static Collection<vb> d(String $$0) {
      try {
         return (Collection<vb>)fi.b(kb.e.p(), $$0, true)
            .map(
               $$0x -> Lists.newArrayList(new vb[]{$$0x.a().b().f().a(n.i)}),
               $$0x -> $$0x.a().a().map($$0xx -> ((cvz)$$0xx.a()).f().a(n.i)).collect(Collectors.toList())
            );
      } catch (CommandSyntaxException var2) {
         return Lists.newArrayList(new vb[]{vb.b("missingno").a(n.i)});
      }
   }

   public boolean B() {
      return this.d().i(this);
   }

   public cmy C() {
      return this.d().n(this);
   }

   public boolean D() {
      return !this.d().d_(this) ? false : !this.E();
   }

   public void a(cqs $$0, int $$1) {
      this.w();
      if (!this.A.b("Enchantments", 9)) {
         this.A.a("Enchantments", new sp());
      }

      sp $$2 = this.A.c("Enchantments", 10);
      $$2.add(cqu.a(cqu.a($$0), (byte)$$1));
   }

   public boolean E() {
      return this.A != null && this.A.b("Enchantments", 9) ? !this.A.c("Enchantments", 10).isEmpty() : false;
   }

   public void a(String $$0, tg $$1) {
      this.w().a($$0, $$1);
   }

   public boolean F() {
      return this.B instanceof cax;
   }

   public void a(@Nullable blf $$0) {
      this.B = $$0;
   }

   @Nullable
   public cax G() {
      return this.B instanceof cax ? (cax)this.H() : null;
   }

   @Nullable
   public blf H() {
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

   public Multimap<bmw, bmz> a(blk $$0) {
      Multimap<bmw, bmz> $$1;
      if (this.u() && this.A.b("AttributeModifiers", 9)) {
         $$1 = HashMultimap.create();
         sp $$2 = this.A.c("AttributeModifiers", 10);

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            sj $$4 = $$2.a($$3);
            if (!$$4.b("Slot", 8) || $$4.l("Slot").equals($$0.e())) {
               Optional<bmw> $$5 = kb.u.b(agt.a($$4.l("AttributeName")));
               if (!$$5.isEmpty()) {
                  bmz $$6 = bmz.a($$4);
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

   public void a(bmw $$0, bmz $$1, @Nullable blk $$2) {
      this.w();
      if (!this.A.b("AttributeModifiers", 9)) {
         this.A.a("AttributeModifiers", new sp());
      }

      sp $$3 = this.A.c("AttributeModifiers", 10);
      sj $$4 = $$1.d();
      $$4.a("AttributeName", kb.u.b($$0).toString());
      if ($$2 != null) {
         $$4.a("Slot", $$2.e());
      }

      $$3.add($$4);
   }

   public vb J() {
      vp $$0 = vb.i().b(this.y());
      if (this.A()) {
         $$0.a(n.u);
      }

      vp $$1 = ve.a((vb)$$0);
      if (!this.b()) {
         $$1.a(this.C().e).a($$0x -> $$0x.a(new vh(vh.a.b, new vh.c(this))));
      }

      return $$1;
   }

   public boolean a(ir<cvz> $$0, dit $$1) {
      if (this.D == null) {
         this.D = new cjp("CanPlaceOn");
      }

      return this.D.a(this, $$0, $$1);
   }

   public boolean b(ir<cvz> $$0, dit $$1) {
      if (this.C == null) {
         this.C = new cjp("CanDestroy");
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

   public void b(csy $$0, blv $$1, int $$2) {
      this.d().a($$0, $$1, this, $$2);
   }

   public void a(cbe $$0) {
      this.d().a($$0);
   }

   public boolean M() {
      return this.d().u();
   }

   public arb N() {
      return this.d().an_();
   }

   public arb O() {
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
