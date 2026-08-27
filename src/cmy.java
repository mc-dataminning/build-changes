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

public final class cmy {
   public static final Codec<cmy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               kd.h.r().fieldOf("id").forGetter(cmy::e),
               Codec.INT.fieldOf("Count").forGetter(cmy::L),
               sn.a.optionalFieldOf("tag").forGetter($$0x -> Optional.ofNullable($$0x.v()))
            )
            .apply($$0, cmy::new)
   );
   private static final Codec<cmt> n = atw.a(
      kd.h.q(), (Function<cmt, DataResult<cmt>>)($$0 -> $$0 == cnb.a ? DataResult.error(() -> "Item must not be minecraft:air") : DataResult.success($$0))
   );
   public static final Codec<cmy> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(kd.h.r().fieldOf("item").forGetter(cmy::e), atw.a(tl.i, "nbt").forGetter($$0x -> Optional.ofNullable($$0x.v())))
            .apply($$0, ($$0x, $$1) -> new cmy($$0x, 1, $$1))
   );
   public static final Codec<cmy> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(n.fieldOf("item").forGetter(cmy::d), atw.a(atw.j, "count", Integer.valueOf(1)).forGetter(cmy::L)).apply($$0, cmy::new)
   );
   public static final Codec<cmy> d = n.xmap(cmy::new, cmy::d);
   public static final MapCodec<cmy> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kd.h.q().fieldOf("result").forGetter(cmy::d), Codec.INT.fieldOf("count").forGetter(cmy::L)).apply($$0, cmy::new)
   );
   private static final Logger o = LogUtils.getLogger();
   public static final cmy f = new cmy((Void)null);
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
   private static final vf u = vf.c("item.disabled").a(n.m);
   private static final int v = 0;
   private static final wc w = wc.a.a(n.f).b(true);
   private int x;
   private int y;
   @Deprecated
   @Nullable
   private final cmt z;
   @Nullable
   private sn A;
   @Nullable
   private blv B;
   @Nullable
   private ckg C;
   @Nullable
   private ckg D;

   public Optional<cke> a() {
      return this.d().h(this);
   }

   public cmy(cto $$0) {
      this($$0, 1);
   }

   public cmy(ih<cmt> $$0) {
      this($$0.a(), 1);
   }

   public cmy(ih<cmt> $$0, int $$1, Optional<sn> $$2) {
      this($$0, $$1);
      $$2.ifPresent(this::c);
   }

   public cmy(ih<cmt> $$0, int $$1) {
      this($$0.a(), $$1);
   }

   public cmy(cto $$0, int $$1) {
      this.z = $$0.k();
      this.x = $$1;
      if (this.z.o()) {
         this.b(this.k());
      }
   }

   private cmy(@Nullable Void $$0) {
      this.z = null;
   }

   private cmy(sn $$0) {
      this.z = kd.h.a(new ahg($$0.l("id")));
      this.x = $$0.f("Count");
      if ($$0.b("tag", 10)) {
         this.A = $$0.p("tag").h();
         this.d().b(this.A);
      }

      if (this.d().o()) {
         this.b(this.k());
      }
   }

   public static cmy a(sn $$0) {
      try {
         return new cmy($$0);
      } catch (RuntimeException var2) {
         o.debug("Tried to load invalid item: {}", $$0, var2);
         return f;
      }
   }

   public boolean b() {
      return this == f || this.z == cnb.a || this.x <= 0;
   }

   public boolean a(chs $$0) {
      return this.b() || this.d().a($$0);
   }

   public cmy a(int $$0) {
      int $$1 = Math.min($$0, this.L());
      cmy $$2 = this.c($$1);
      this.h($$1);
      return $$2;
   }

   public cmy c() {
      if (this.b()) {
         return f;
      } else {
         cmy $$0 = this.p();
         this.f(0);
         return $$0;
      }
   }

   public cmt d() {
      return this.b() ? cnb.a : this.z;
   }

   public ih<cmt> e() {
      return this.d().j();
   }

   public boolean a(asw<cmt> $$0) {
      return this.d().j().a($$0);
   }

   public boolean a(cmt $$0) {
      return this.d() == $$0;
   }

   public boolean a(Predicate<ih<cmt>> $$0) {
      return $$0.test(this.d().j());
   }

   public boolean a(ih<cmt> $$0) {
      return this.d().j() == $$0;
   }

   public boolean a(il<cmt> $$0) {
      return $$0.a(this.e());
   }

   public Stream<asw<cmt>> f() {
      return this.d().j().c();
   }

   public bkb a(cpj $$0) {
      cfi $$1 = $$0.o();
      hx $$2 = $$0.a();
      djl $$3 = new djl($$0.q(), $$2, false);
      if ($$1 != null && !$$1.fT().e && !this.a($$0.q().I_().d(ke.f), $$3)) {
         return bkb.d;
      } else {
         cmt $$4 = this.d();
         bkb $$5 = $$4.a($$0);
         if ($$1 != null && $$5.c()) {
            $$1.b(asc.c.b($$4));
         }

         return $$5;
      }
   }

   public float a(djh $$0) {
      return this.d().a(this, $$0);
   }

   public bkc<cmy> a(ctp $$0, cfi $$1, bka $$2) {
      return this.d().a($$0, $$1, $$2);
   }

   public cmy a(ctp $$0, bml $$1) {
      return this.d().a(this, $$0, $$1);
   }

   public sn b(sn $$0) {
      ahg $$1 = kd.h.b(this.d());
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
         sn $$0 = this.v();
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

   public boolean a(int $$0, auv $$1, @Nullable ane $$2) {
      if (!this.i()) {
         return false;
      } else {
         if ($$0 > 0) {
            int $$3 = crl.a(crn.w, this);
            int $$4 = 0;

            for (int $$5 = 0; $$3 > 0 && $$5 < $$0; $$5++) {
               if (crh.a(this, $$3, $$1)) {
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

   public <T extends bml> void a(int $$0, T $$1, Consumer<T> $$2) {
      if (!$$1.dM().B && (!($$1 instanceof cfi) || !((cfi)$$1).fT().d)) {
         if (this.i()) {
            if (this.a($$0, $$1.eg(), $$1 instanceof ane ? (ane)$$1 : null)) {
               $$2.accept($$1);
               cmt $$3 = this.d();
               this.h(1);
               if ($$1 instanceof cfi) {
                  ((cfi)$$1).b(asc.d.b($$3));
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

   public boolean a(cjw $$0, cij $$1, cfi $$2) {
      return this.d().a(this, $$0, $$1, $$2);
   }

   public boolean a(cmy $$0, cjw $$1, cij $$2, cfi $$3, bnd $$4) {
      return this.d().a(this, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(bml $$0, cfi $$1) {
      cmt $$2 = this.d();
      if ($$2.a(this, $$0, $$1)) {
         $$1.b(asc.c.b($$2));
      }
   }

   public void a(ctp $$0, djh $$1, hx $$2, cfi $$3) {
      cmt $$4 = this.d();
      if ($$4.a(this, $$0, $$1, $$2, $$3)) {
         $$3.b(asc.c.b($$4));
      }
   }

   public boolean b(djh $$0) {
      return this.d().a_($$0);
   }

   public bkb a(cfi $$0, bml $$1, bka $$2) {
      return this.d().a(this, $$0, $$1, $$2);
   }

   public cmy p() {
      if (this.b()) {
         return f;
      } else {
         cmy $$0 = new cmy(this.d(), this.x);
         $$0.e(this.K());
         if (this.A != null) {
            $$0.A = this.A.h();
         }

         return $$0;
      }
   }

   public cmy c(int $$0) {
      if (this.b()) {
         return f;
      } else {
         cmy $$1 = this.p();
         $$1.f($$0);
         return $$1;
      }
   }

   public static boolean a(cmy $$0, cmy $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return $$0.L() != $$1.L() ? false : c($$0, $$1);
      }
   }

   public static boolean b(cmy $$0, cmy $$1) {
      return $$0.a($$1.d());
   }

   public static boolean c(cmy $$0, cmy $$1) {
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

   public void a(ctp $$0, blv $$1, int $$2, boolean $$3) {
      if (this.y > 0) {
         this.y--;
      }

      if (this.d() != null) {
         this.d().a(this, $$0, $$1, $$2, $$3);
      }
   }

   public void a(ctp $$0, cfi $$1, int $$2) {
      $$1.a(asc.b.b(this.d()), $$2);
      this.d().b(this, $$0, $$1);
   }

   public void a(ctp $$0) {
      this.d().a(this, $$0);
   }

   public int r() {
      return this.d().b(this);
   }

   public cos s() {
      return this.d().c(this);
   }

   public void a(ctp $$0, bml $$1, int $$2) {
      this.d().a(this, $$0, $$1, $$2);
   }

   public boolean t() {
      return this.d().l(this);
   }

   public boolean u() {
      return !this.b() && this.A != null && !this.A.g();
   }

   @Nullable
   public sn v() {
      return this.A;
   }

   public sn w() {
      if (this.A == null) {
         this.c(new sn());
      }

      return this.A;
   }

   public sn a(String $$0) {
      if (this.A != null && this.A.b($$0, 10)) {
         return this.A.p($$0);
      } else {
         sn $$1 = new sn();
         this.a($$0, $$1);
         return $$1;
      }
   }

   @Nullable
   public sn b(String $$0) {
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

   public st x() {
      return this.A != null ? this.A.c("Enchantments", 10) : new st();
   }

   public void c(@Nullable sn $$0) {
      this.A = $$0;
      if (this.d().o()) {
         this.b(this.k());
      }

      if ($$0 != null) {
         this.d().b($$0);
      }
   }

   public vf y() {
      sn $$0 = this.b("display");
      if ($$0 != null && $$0.b("Name", 8)) {
         try {
            vf $$1 = vf.a.a($$0.l("Name"));
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

   public cmy a(@Nullable vf $$0) {
      sn $$1 = this.a("display");
      if ($$0 != null) {
         $$1.a("Name", vf.a.a($$0));
      } else {
         $$1.r("Name");
      }

      return this;
   }

   public void z() {
      sn $$0 = this.b("display");
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
      sn $$0 = this.b("display");
      return $$0 != null && $$0.b("Name", 8);
   }

   public List<vf> a(@Nullable cfi $$0, coq $$1) {
      List<vf> $$2 = Lists.newArrayList();
      vt $$3 = vf.i().b(this.y()).a(this.C().e);
      if (this.A()) {
         $$3.a(n.u);
      }

      $$2.add($$3);
      if (!$$1.a() && !this.A() && this.a(cnb.rR)) {
         Integer $$4 = cnf.d(this);
         if ($$4 != null) {
            $$2.add(cnf.k(this));
         }
      }

      int $$5 = this.P();
      if (a($$5, cmy.a.f)) {
         this.d().a(this, $$0 == null ? null : $$0.dM(), $$2, $$1);
      }

      if (this.u()) {
         if (a($$5, cmy.a.h) && $$0 != null) {
            cpb.a(this, $$0.dM().I_(), $$2);
         }

         if (a($$5, cmy.a.a)) {
            a($$2, this.x());
         }

         if (this.A.b("display", 10)) {
            sn $$6 = this.A.p("display");
            if (a($$5, cmy.a.g) && $$6.b("color", 99)) {
               if ($$1.a()) {
                  $$2.add(vf.a("item.color", String.format(Locale.ROOT, "#%06X", $$6.h("color"))).a(n.h));
               } else {
                  $$2.add(vf.c("item.dyed").a(n.h, n.u));
               }
            }

            if ($$6.d("Lore") == 9) {
               st $$7 = $$6.c("Lore", 8);

               for (int $$8 = 0; $$8 < $$7.size(); $$8++) {
                  String $$9 = $$7.j($$8);

                  try {
                     vt $$10 = vf.a.a($$9);
                     if ($$10 != null) {
                        $$2.add(vi.a($$10, w));
                     }
                  } catch (Exception var19) {
                     $$6.r("Lore");
                  }
               }
            }
         }
      }

      if (a($$5, cmy.a.b)) {
         for (bma $$12 : bma.values()) {
            Multimap<bnm, bnp> $$13 = this.a($$12);
            if (!$$13.isEmpty()) {
               $$2.add(ve.a);
               $$2.add(vf.c("item.modifiers." + $$12.e()).a(n.h));

               for (Entry<bnm, bnp> $$14 : $$13.entries()) {
                  bnp $$15 = $$14.getValue();
                  double $$16 = $$15.c();
                  boolean $$17 = false;
                  if ($$0 != null) {
                     if ($$15.a() == cmt.m) {
                        $$16 += $$0.c(bnr.c);
                        $$16 += (double)crl.a(this, bmq.a);
                        $$17 = true;
                     } else if ($$15.a() == cmt.n) {
                        $$16 += $$0.c(bnr.e);
                        $$17 = true;
                     }
                  }

                  double $$18;
                  if ($$15.b() == bnp.a.b || $$15.b() == bnp.a.c) {
                     $$18 = $$16 * 100.0;
                  } else if ($$14.getKey().equals(bnr.i)) {
                     $$18 = $$16 * 10.0;
                  } else {
                     $$18 = $$16;
                  }

                  if ($$17) {
                     $$2.add(ve.a().b(vf.a("attribute.modifier.equals." + $$15.b().a(), g.format($$18), vf.c($$14.getKey().c()))).a(n.c));
                  } else if ($$16 > 0.0) {
                     $$2.add(vf.a("attribute.modifier.plus." + $$15.b().a(), g.format($$18), vf.c($$14.getKey().c())).a(n.j));
                  } else if ($$16 < 0.0) {
                     $$18 *= -1.0;
                     $$2.add(vf.a("attribute.modifier.take." + $$15.b().a(), g.format($$18), vf.c($$14.getKey().c())).a(n.m));
                  }
               }
            }
         }
      }

      if (this.u()) {
         if (a($$5, cmy.a.c) && this.A.q("Unbreakable")) {
            $$2.add(vf.c("item.unbreakable").a(n.j));
         }

         if (a($$5, cmy.a.d) && this.A.b("CanDestroy", 9)) {
            st $$21 = this.A.c("CanDestroy", 8);
            if (!$$21.isEmpty()) {
               $$2.add(ve.a);
               $$2.add(vf.c("item.canBreak").a(n.h));

               for (int $$22 = 0; $$22 < $$21.size(); $$22++) {
                  $$2.addAll(d($$21.j($$22)));
               }
            }
         }

         if (a($$5, cmy.a.e) && this.A.b("CanPlaceOn", 9)) {
            st $$23 = this.A.c("CanPlaceOn", 8);
            if (!$$23.isEmpty()) {
               $$2.add(ve.a);
               $$2.add(vf.c("item.canPlace").a(n.h));

               for (int $$24 = 0; $$24 < $$23.size(); $$24++) {
                  $$2.addAll(d($$23.j($$24)));
               }
            }
         }
      }

      if ($$1.a()) {
         if (this.j()) {
            $$2.add(vf.a("item.durability", this.l() - this.k(), this.l()));
         }

         $$2.add(vf.b(kd.h.b(this.d()).toString()).a(n.i));
         if (this.u()) {
            $$2.add(vf.a("item.nbt_tags", this.A.e().size()).a(n.i));
         }
      }

      if ($$0 != null && !this.d().a($$0.dM().I())) {
         $$2.add(u);
      }

      return $$2;
   }

   private static boolean a(int $$0, cmy.a $$1) {
      return ($$0 & $$1.a()) == 0;
   }

   private int P() {
      return this.u() && this.A.b("HideFlags", 99) ? this.A.h("HideFlags") : 0;
   }

   public void a(cmy.a $$0) {
      sn $$1 = this.w();
      $$1.a("HideFlags", $$1.h("HideFlags") | $$0.a());
   }

   public static void a(List<vf> $$0, st $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         sn $$3 = $$1.a($$2);
         kd.f.b(crl.b($$3)).ifPresent($$2x -> $$0.add($$2x.d(crl.a($$3))));
      }
   }

   private static Collection<vf> d(String $$0) {
      try {
         return (Collection<vf>)fk.b(kd.e.p(), $$0, true)
            .map(
               $$0x -> Lists.newArrayList(new vf[]{$$0x.a().b().f().a(n.i)}),
               $$0x -> $$0x.a().a().map($$0xx -> ((cwq)$$0xx.a()).f().a(n.i)).collect(Collectors.toList())
            );
      } catch (CommandSyntaxException var2) {
         return Lists.newArrayList(new vf[]{vf.b("missingno").a(n.i)});
      }
   }

   public boolean B() {
      return this.d().i(this);
   }

   public cnp C() {
      return this.d().n(this);
   }

   public boolean D() {
      return !this.d().d_(this) ? false : !this.E();
   }

   public void a(crj $$0, int $$1) {
      this.w();
      if (!this.A.b("Enchantments", 9)) {
         this.A.a("Enchantments", new st());
      }

      st $$2 = this.A.c("Enchantments", 10);
      $$2.add(crl.a(crl.a($$0), (byte)$$1));
   }

   public boolean E() {
      return this.A != null && this.A.b("Enchantments", 9) ? !this.A.c("Enchantments", 10).isEmpty() : false;
   }

   public void a(String $$0, tk $$1) {
      this.w().a($$0, $$1);
   }

   public boolean F() {
      return this.B instanceof cbn;
   }

   public void a(@Nullable blv $$0) {
      this.B = $$0;
   }

   @Nullable
   public cbn G() {
      return this.B instanceof cbn ? (cbn)this.H() : null;
   }

   @Nullable
   public blv H() {
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

   public Multimap<bnm, bnp> a(bma $$0) {
      Multimap<bnm, bnp> $$1;
      if (this.u() && this.A.b("AttributeModifiers", 9)) {
         $$1 = HashMultimap.create();
         st $$2 = this.A.c("AttributeModifiers", 10);

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            sn $$4 = $$2.a($$3);
            if (!$$4.b("Slot", 8) || $$4.l("Slot").equals($$0.e())) {
               Optional<bnm> $$5 = kd.u.b(ahg.a($$4.l("AttributeName")));
               if (!$$5.isEmpty()) {
                  bnp $$6 = bnp.a($$4);
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

   public void a(bnm $$0, bnp $$1, @Nullable bma $$2) {
      this.w();
      if (!this.A.b("AttributeModifiers", 9)) {
         this.A.a("AttributeModifiers", new st());
      }

      st $$3 = this.A.c("AttributeModifiers", 10);
      sn $$4 = $$1.d();
      $$4.a("AttributeName", kd.u.b($$0).toString());
      if ($$2 != null) {
         $$4.a("Slot", $$2.e());
      }

      $$3.add($$4);
   }

   public vf J() {
      vt $$0 = vf.i().b(this.y());
      if (this.A()) {
         $$0.a(n.u);
      }

      vt $$1 = vi.a((vf)$$0);
      if (!this.b()) {
         $$1.a(this.C().e).a($$0x -> $$0x.a(new vl(vl.a.b, new vl.c(this))));
      }

      return $$1;
   }

   public boolean a(it<cwq> $$0, djl $$1) {
      if (this.D == null) {
         this.D = new ckg("CanPlaceOn");
      }

      return this.D.a(this, $$0, $$1);
   }

   public boolean b(it<cwq> $$0, djl $$1) {
      if (this.C == null) {
         this.C = new ckg("CanDestroy");
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

   public void b(ctp $$0, bml $$1, int $$2) {
      this.d().a($$0, $$1, this, $$2);
   }

   public void a(cbu $$0) {
      this.d().a($$0);
   }

   public boolean M() {
      return this.d().u();
   }

   public arr N() {
      return this.d().an_();
   }

   public arr O() {
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
