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
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class cpq {
   public static final Codec<cpq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               kh.h.r().fieldOf("id").forGetter(cpq::e),
               Codec.INT.fieldOf("Count").forGetter(cpq::M),
               sy.a.optionalFieldOf("tag").forGetter($$0x -> Optional.ofNullable($$0x.w()))
            )
            .apply($$0, cpq::new)
   );
   private static final Codec<cpl> p = avu.a(
      kh.h.q(), (Function<cpl, DataResult<cpl>>)($$0 -> $$0 == cpt.a ? DataResult.error(() -> "Item must not be minecraft:air") : DataResult.success($$0))
   );
   public static final Codec<cpq> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(kh.h.r().fieldOf("item").forGetter(cpq::e), avu.a(tw.i, "nbt").forGetter($$0x -> Optional.ofNullable($$0x.w())))
            .apply($$0, ($$0x, $$1) -> new cpq($$0x, 1, $$1))
   );
   public static final Codec<cpq> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(p.fieldOf("item").forGetter(cpq::d), avu.a(avu.k, "count", Integer.valueOf(1)).forGetter(cpq::M)).apply($$0, cpq::new)
   );
   public static final Codec<cpq> d = p.xmap(cpq::new, cpq::d);
   public static final MapCodec<cpq> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kh.h.q().fieldOf("result").forGetter(cpq::d), Codec.INT.fieldOf("count").forGetter(cpq::M)).apply($$0, cpq::new)
   );
   public static final xq<vd, cpq> f = new xq<vd, cpq>() {
      private static final xq<vd, cpl> a = xo.a(ki.F);

      public cpq a(vd $$0) {
         if (!$$0.readBoolean()) {
            return cpq.h;
         } else {
            cpl $$1 = a.decode($$0);
            int $$2 = $$0.readByte();
            cpq $$3 = new cpq($$1, $$2);
            $$3.c(us.f($$0));
            return $$3;
         }
      }

      public void a(vd $$0, cpq $$1) {
         if ($$1.b()) {
            $$0.a(false);
         } else {
            $$0.a(true);
            cpl $$2 = $$1.d();
            a.encode($$0, $$2);
            $$0.k($$1.M());
            sy $$3 = null;
            if ($$2.p() || $$2.s()) {
               $$3 = $$1.w();
            }

            us.a($$0, $$3);
         }
      }
   };
   public static final xq<vd, List<cpq>> g = f.a(xo.a(iu::a));
   private static final Logger q = LogUtils.getLogger();
   public static final cpq h = new cpq((Void)null);
   public static final DecimalFormat i = ac.a(new DecimalFormat("#.##"), $$0 -> $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));
   public static final String j = "Enchantments";
   public static final String k = "display";
   public static final String l = "Name";
   public static final String m = "Lore";
   public static final String n = "Damage";
   public static final String o = "color";
   private static final String r = "Unbreakable";
   private static final String s = "RepairCost";
   private static final String t = "CanDestroy";
   private static final String u = "CanPlaceOn";
   private static final String v = "HideFlags";
   private static final vs w = vs.c("item.disabled").a(n.m);
   private static final int x = 0;
   private static final wp y = wp.a.a(n.f).b(true);
   private int z;
   private int A;
   @Deprecated
   @Nullable
   private final cpl B;
   @Nullable
   private sy C;
   @Nullable
   private bof D;
   @Nullable
   private cmz E;
   @Nullable
   private cmz F;

   public Optional<cmx> a() {
      return this.d().h(this);
   }

   public cpq(cwd $$0) {
      this($$0, 1);
   }

   public cpq(il<cpl> $$0) {
      this($$0.a(), 1);
   }

   public cpq(il<cpl> $$0, int $$1, Optional<sy> $$2) {
      this($$0, $$1);
      $$2.ifPresent(this::c);
   }

   public cpq(il<cpl> $$0, int $$1) {
      this($$0.a(), $$1);
   }

   public cpq(cwd $$0, int $$1) {
      this.B = $$0.l();
      this.z = $$1;
      if (this.B.p()) {
         this.b(this.l());
      }
   }

   private cpq(@Nullable Void $$0) {
      this.B = null;
   }

   private cpq(sy $$0) {
      this.B = kh.h.a(new ajc($$0.l("id")));
      this.z = $$0.f("Count");
      if ($$0.b("tag", 10)) {
         this.C = $$0.p("tag").h();
         this.d().b(this.C);
      }

      if (this.d().p()) {
         this.b(this.l());
      }
   }

   public static cpq a(sy $$0) {
      try {
         return new cpq($$0);
      } catch (RuntimeException var2) {
         q.debug("Tried to load invalid item: {}", $$0, var2);
         return h;
      }
   }

   public boolean b() {
      return this == h || this.B == cpt.a || this.z <= 0;
   }

   public boolean a(ckl $$0) {
      return this.b() || this.d().a($$0);
   }

   public cpq a(int $$0) {
      int $$1 = Math.min($$0, this.M());
      cpq $$2 = this.c($$1);
      this.h($$1);
      return $$2;
   }

   public cpq c() {
      if (this.b()) {
         return h;
      } else {
         cpq $$0 = this.q();
         this.f(0);
         return $$0;
      }
   }

   public cpl d() {
      return this.b() ? cpt.a : this.B;
   }

   public il<cpl> e() {
      return this.d().k();
   }

   public boolean a(aut<cpl> $$0) {
      return this.d().k().a($$0);
   }

   public boolean a(cpl $$0) {
      return this.d() == $$0;
   }

   public boolean a(Predicate<il<cpl>> $$0) {
      return $$0.test(this.d().k());
   }

   public boolean a(il<cpl> $$0) {
      return this.d().k() == $$0;
   }

   public boolean a(ip<cpl> $$0) {
      return $$0.a(this.e());
   }

   public Stream<aut<cpl>> f() {
      return this.d().k().c();
   }

   public bml a(crz $$0) {
      cia $$1 = $$0.o();
      ib $$2 = $$0.a();
      dmi $$3 = new dmi($$0.q(), $$2, false);
      if ($$1 != null && !$$1.fW().e && !this.a($$0.q().I_().d(ki.f), $$3)) {
         return bml.d;
      } else {
         cpl $$4 = this.d();
         bml $$5 = $$4.a($$0);
         if ($$1 != null && $$5.c()) {
            $$1.b(atz.c.b($$4));
         }

         return $$5;
      }
   }

   public float a(dme $$0) {
      return this.d().a(this, $$0);
   }

   public bmm<cpq> a(cwe $$0, cia $$1, bmk $$2) {
      return this.d().a($$0, $$1, $$2);
   }

   public cpq a(cwe $$0, box $$1) {
      return this.d().a(this, $$0, $$1);
   }

   public sy b(sy $$0) {
      ajc $$1 = kh.h.b(this.d());
      $$0.a("id", $$1 == null ? "minecraft:air" : $$1.toString());
      $$0.a("Count", (byte)this.z);
      if (this.C != null) {
         $$0.a("tag", this.C.h());
      }

      return $$0;
   }

   public int g() {
      return this.d().n();
   }

   public boolean h() {
      return this.g() > 1 && (!this.i() || !this.k());
   }

   public boolean i() {
      return !this.b() && this.d().o() > 0 ? !this.j() : false;
   }

   public boolean j() {
      sy $$0 = this.w();
      return $$0 != null && $$0.q("Unbreakable");
   }

   public boolean k() {
      return this.i() && this.l() > 0;
   }

   public int l() {
      return this.C == null ? 0 : this.C.h("Damage");
   }

   public void b(int $$0) {
      this.x().a("Damage", Math.max(0, $$0));
   }

   public int m() {
      return this.d().o();
   }

   public void a(int $$0, awt $$1, @Nullable apb $$2, Runnable $$3) {
      if (this.i()) {
         if ($$0 > 0) {
            int $$4 = cua.a(cuc.w, this);
            int $$5 = 0;

            for (int $$6 = 0; $$4 > 0 && $$6 < $$0; $$6++) {
               if (ctx.a(this, $$4, $$1)) {
                  $$5++;
               }
            }

            $$0 -= $$5;
            if ($$0 <= 0) {
               return;
            }
         }

         if ($$2 != null && $$0 != 0) {
            am.u.a($$2, this, this.l() + $$0);
         }

         int $$7 = this.l() + $$0;
         this.b($$7);
         if ($$7 >= this.m()) {
            $$3.run();
         }
      }
   }

   public void a(int $$0, box $$1, bom $$2) {
      if (!$$1.dJ().B && (!($$1 instanceof cia) || !((cia)$$1).fW().d)) {
         this.a($$0, $$1.ef(), $$1 instanceof apb $$3 ? $$3 : null, () -> {
            $$1.d($$2);
            cpl $$2x = this.d();
            this.h(1);
            if ($$1 instanceof cia) {
               ((cia)$$1).b(atz.d.b($$2x));
            }

            this.b(0);
         });
      }
   }

   public boolean n() {
      return this.d().e(this);
   }

   public int o() {
      return this.d().f(this);
   }

   public int p() {
      return this.d().g(this);
   }

   public boolean a(cmp $$0, clc $$1, cia $$2) {
      return this.d().a(this, $$0, $$1, $$2);
   }

   public boolean a(cpq $$0, cmp $$1, clc $$2, cia $$3, bpo $$4) {
      return this.d().a(this, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(box $$0, cia $$1) {
      cpl $$2 = this.d();
      if ($$2.a(this, $$0, $$1)) {
         $$1.b(atz.c.b($$2));
      }
   }

   public void a(cwe $$0, dme $$1, ib $$2, cia $$3) {
      cpl $$4 = this.d();
      if ($$4.a(this, $$0, $$1, $$2, $$3)) {
         $$3.b(atz.c.b($$4));
      }
   }

   public boolean b(dme $$0) {
      return this.d().a_($$0);
   }

   public bml a(cia $$0, box $$1, bmk $$2) {
      return this.d().a(this, $$0, $$1, $$2);
   }

   public cpq q() {
      if (this.b()) {
         return h;
      } else {
         cpq $$0 = new cpq(this.d(), this.z);
         $$0.e(this.L());
         if (this.C != null) {
            $$0.C = this.C.h();
         }

         return $$0;
      }
   }

   public cpq c(int $$0) {
      if (this.b()) {
         return h;
      } else {
         cpq $$1 = this.q();
         $$1.f($$0);
         return $$1;
      }
   }

   public cpq a(cwd $$0, int $$1) {
      return this.b() ? h : this.b($$0, $$1);
   }

   public cpq b(cwd $$0, int $$1) {
      cpq $$2 = new cpq($$0, $$1);
      if (this.C != null) {
         $$2.c(this.C.h());
      }

      return $$2;
   }

   public static boolean a(cpq $$0, cpq $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return $$0.M() != $$1.M() ? false : c($$0, $$1);
      }
   }

   public static boolean b(cpq $$0, cpq $$1) {
      return $$0.a($$1.d());
   }

   public static boolean c(cpq $$0, cpq $$1) {
      if (!$$0.a($$1.d())) {
         return false;
      } else {
         return $$0.b() && $$1.b() ? true : Objects.equals($$0.C, $$1.C);
      }
   }

   public static MapCodec<cpq> a(String $$0) {
      return a.optionalFieldOf($$0).xmap($$0x -> $$0x.orElse(h), $$0x -> $$0x.b() ? Optional.empty() : Optional.of($$0x));
   }

   public String r() {
      return this.d().j(this);
   }

   @Override
   public String toString() {
      return this.M() + " " + this.d();
   }

   public void a(cwe $$0, bof $$1, int $$2, boolean $$3) {
      if (this.A > 0) {
         this.A--;
      }

      if (this.d() != null) {
         this.d().a(this, $$0, $$1, $$2, $$3);
      }
   }

   public void a(cwe $$0, cia $$1, int $$2) {
      $$1.a(atz.b.b(this.d()), $$2);
      this.d().b(this, $$0, $$1);
   }

   public void a(cwe $$0) {
      this.d().a(this, $$0);
   }

   public int s() {
      return this.d().b(this);
   }

   public crj t() {
      return this.d().c(this);
   }

   public void a(cwe $$0, box $$1, int $$2) {
      this.d().a(this, $$0, $$1, $$2);
   }

   public boolean u() {
      return this.d().l(this);
   }

   public boolean v() {
      return !this.b() && this.C != null && !this.C.g();
   }

   @Nullable
   public sy w() {
      return this.C;
   }

   public sy x() {
      if (this.C == null) {
         this.c(new sy());
      }

      return this.C;
   }

   public sy b(String $$0) {
      if (this.C != null && this.C.b($$0, 10)) {
         return this.C.p($$0);
      } else {
         sy $$1 = new sy();
         this.a($$0, $$1);
         return $$1;
      }
   }

   @Nullable
   public sy c(String $$0) {
      return this.C != null && this.C.b($$0, 10) ? this.C.p($$0) : null;
   }

   public void d(String $$0) {
      if (this.C != null && this.C.e($$0)) {
         this.C.r($$0);
         if (this.C.g()) {
            this.C = null;
         }
      }
   }

   public te y() {
      return this.C != null ? this.C.c("Enchantments", 10) : new te();
   }

   public void c(@Nullable sy $$0) {
      this.C = $$0;
      if (this.d().p()) {
         this.b(this.l());
      }

      if ($$0 != null) {
         this.d().b($$0);
      }
   }

   public vs z() {
      sy $$0 = this.c("display");
      if ($$0 != null && $$0.b("Name", 8)) {
         try {
            vs $$1 = vs.a.a($$0.l("Name"));
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

   public cpq a(@Nullable vs $$0) {
      sy $$1 = this.b("display");
      if ($$0 != null) {
         $$1.a("Name", vs.a.a($$0));
      } else {
         $$1.r("Name");
      }

      return this;
   }

   public void A() {
      sy $$0 = this.c("display");
      if ($$0 != null) {
         $$0.r("Name");
         if ($$0.g()) {
            this.d("display");
         }
      }

      if (this.C != null && this.C.g()) {
         this.C = null;
      }
   }

   public boolean B() {
      sy $$0 = this.c("display");
      return $$0 != null && $$0.b("Name", 8);
   }

   public List<vs> a(@Nullable cia $$0, crh $$1) {
      List<vs> $$2 = Lists.newArrayList();
      wg $$3 = vs.i().b(this.z()).a(this.D().e);
      if (this.B()) {
         $$3.a(n.u);
      }

      $$2.add($$3);
      if (!$$1.a() && !this.B() && this.a(cpt.rT)) {
         eja $$4 = cpx.d(this);
         if ($$4 != null) {
            $$2.add(cpx.k(this));
         }
      }

      int $$5 = this.Q();
      if (a($$5, cpq.a.f)) {
         this.d().a(this, $$0 == null ? null : $$0.dJ(), $$2, $$1);
         a($$2, com.d(this));
      }

      if (a($$5, cpq.a.h) && $$0 != null) {
         crr.a(this, $$0.dJ().I_(), $$2);
      }

      if (a($$5, cpq.a.a)) {
         a($$2, this.y());
      }

      if (this.C != null && this.C.b("display", 10)) {
         sy $$6 = this.C.p("display");
         if (a($$5, cpq.a.g) && $$6.b("color", 99)) {
            if ($$1.a()) {
               $$2.add(vs.a("item.color", String.format(Locale.ROOT, "#%06X", $$6.h("color"))).a(n.h));
            } else {
               $$2.add(vs.c("item.dyed").a(n.h, n.u));
            }
         }

         if ($$6.d("Lore") == 9) {
            te $$7 = $$6.c("Lore", 8);

            for (int $$8 = 0; $$8 < $$7.size(); $$8++) {
               String $$9 = $$7.j($$8);

               try {
                  wg $$10 = vs.a.a($$9);
                  if ($$10 != null) {
                     $$2.add(vv.a($$10, y));
                  }
               } catch (Exception var19) {
                  $$6.r("Lore");
               }
            }
         }
      }

      if (a($$5, cpq.a.b)) {
         for (bom $$12 : bom.values()) {
            Multimap<il<bpz>, bqc> $$13 = this.a($$12);
            if (!$$13.isEmpty()) {
               $$2.add(vr.a);
               $$2.add(vs.c("item.modifiers." + $$12.e()).a(n.h));

               for (Entry<il<bpz>, bqc> $$14 : $$13.entries()) {
                  bqc $$15 = $$14.getValue();
                  double $$16 = $$15.c();
                  boolean $$17 = false;
                  if ($$0 != null) {
                     if ($$15.a() == cpl.m) {
                        $$16 += $$0.h(bqe.c);
                        $$16 += (double)cua.a(this, null);
                        $$17 = true;
                     } else if ($$15.a() == cpl.n) {
                        $$16 += $$0.h(bqe.e);
                        $$17 = true;
                     }
                  }

                  double $$18;
                  if ($$15.b() == bqc.a.b || $$15.b() == bqc.a.c) {
                     $$18 = $$16 * 100.0;
                  } else if ($$14.getKey().a(bqe.k)) {
                     $$18 = $$16 * 10.0;
                  } else {
                     $$18 = $$16;
                  }

                  if ($$17) {
                     $$2.add(vr.a().b(vs.a("attribute.modifier.equals." + $$15.b().a(), i.format($$18), vs.c($$14.getKey().a().c()))).a(n.c));
                  } else if ($$16 > 0.0) {
                     $$2.add(vs.a("attribute.modifier.plus." + $$15.b().a(), i.format($$18), vs.c($$14.getKey().a().c())).a(n.j));
                  } else if ($$16 < 0.0) {
                     $$18 *= -1.0;
                     $$2.add(vs.a("attribute.modifier.take." + $$15.b().a(), i.format($$18), vs.c($$14.getKey().a().c())).a(n.m));
                  }
               }
            }
         }
      }

      if (a($$5, cpq.a.c) && this.C != null && this.C.q("Unbreakable")) {
         $$2.add(vs.c("item.unbreakable").a(n.j));
      }

      if (a($$5, cpq.a.d) && this.C != null && this.C.b("CanDestroy", 9)) {
         te $$21 = this.C.c("CanDestroy", 8);
         if (!$$21.isEmpty()) {
            $$2.add(vr.a);
            $$2.add(vs.c("item.canBreak").a(n.h));

            for (int $$22 = 0; $$22 < $$21.size(); $$22++) {
               $$2.addAll(e($$21.j($$22)));
            }
         }
      }

      if (a($$5, cpq.a.e) && this.C != null && this.C.b("CanPlaceOn", 9)) {
         te $$23 = this.C.c("CanPlaceOn", 8);
         if (!$$23.isEmpty()) {
            $$2.add(vr.a);
            $$2.add(vs.c("item.canPlace").a(n.h));

            for (int $$24 = 0; $$24 < $$23.size(); $$24++) {
               $$2.addAll(e($$23.j($$24)));
            }
         }
      }

      if ($$1.a()) {
         if (this.k()) {
            $$2.add(vs.a("item.durability", this.m() - this.l(), this.m()));
         }

         $$2.add(vs.b(kh.h.b(this.d()).toString()).a(n.i));
         if (this.v()) {
            $$2.add(vs.a("item.nbt_tags", this.C.e().size()).a(n.i));
         }
      }

      if ($$0 != null && !this.d().a($$0.dJ().I())) {
         $$2.add(w);
      }

      return $$2;
   }

   private static boolean a(int $$0, cpq.a $$1) {
      return ($$0 & $$1.a()) == 0;
   }

   private int Q() {
      return this.v() && this.C.b("HideFlags", 99) ? this.C.h("HideFlags") : 0;
   }

   public void a(cpq.a $$0) {
      sy $$1 = this.x();
      $$1.a("HideFlags", $$1.h("HideFlags") | $$0.a());
   }

   public static void a(List<vs> $$0, te $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         sy $$3 = $$1.a($$2);
         kh.f.b(cua.b($$3)).ifPresent($$2x -> $$0.add($$2x.d(cua.a($$3))));
      }
   }

   private static Collection<vs> e(String $$0) {
      try {
         return (Collection<vs>)fm.b(kh.e.p(), $$0, true)
            .map(
               $$0x -> Lists.newArrayList(new vs[]{$$0x.a().b().f().a(n.i)}),
               $$0x -> $$0x.a().a().map($$0xx -> ((czf)$$0xx.a()).f().a(n.i)).collect(Collectors.toList())
            );
      } catch (CommandSyntaxException var2) {
         return Lists.newArrayList(new vs[]{vs.b("missingno").a(n.i)});
      }
   }

   public boolean C() {
      return this.d().i(this);
   }

   public cqh D() {
      return this.d().n(this);
   }

   public boolean E() {
      return !this.d().d_(this) ? false : !this.F();
   }

   public void a(ctz $$0, int $$1) {
      Map<ctz, Integer> $$2 = cua.a(this);
      if ($$1 != 0) {
         $$2.merge($$0, $$1, Integer::max);
      }

      cua.a($$2, this);
   }

   public boolean F() {
      return this.C != null && this.C.b("Enchantments", 9) ? !this.C.c("Enchantments", 10).isEmpty() : false;
   }

   public void a(String $$0, tv $$1) {
      this.x().a($$0, $$1);
   }

   public boolean G() {
      return this.D instanceof cee;
   }

   public void a(@Nullable bof $$0) {
      this.D = $$0;
   }

   @Nullable
   public cee H() {
      return this.D instanceof cee ? (cee)this.I() : null;
   }

   @Nullable
   public bof I() {
      return !this.b() ? this.D : null;
   }

   public int J() {
      return this.v() && this.C.b("RepairCost", 3) ? this.C.h("RepairCost") : 0;
   }

   public void d(int $$0) {
      if ($$0 > 0) {
         this.x().a("RepairCost", $$0);
      } else {
         this.d("RepairCost");
      }
   }

   public Multimap<il<bpz>, bqc> a(bom $$0) {
      Multimap<il<bpz>, bqc> $$1;
      if (this.v() && this.C.b("AttributeModifiers", 9)) {
         $$1 = HashMultimap.create();
         te $$2 = this.C.c("AttributeModifiers", 10);

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            sy $$4 = $$2.a($$3);
            if (!$$4.b("Slot", 8) || $$4.l("Slot").equals($$0.e())) {
               ajc $$5 = ajc.a($$4.l("AttributeName"));
               if ($$5 != null) {
                  Optional<il.c<bpz>> $$6 = kh.u.c($$5);
                  if (!$$6.isEmpty()) {
                     bqc $$7 = bqc.a($$4);
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

   public void a(il<bpz> $$0, bqc $$1, @Nullable bom $$2) {
      this.x();
      if (!this.C.b("AttributeModifiers", 9)) {
         this.C.a("AttributeModifiers", new te());
      }

      te $$3 = this.C.c("AttributeModifiers", 10);
      sy $$4 = $$1.d();
      $$4.a("AttributeName", $$0.e().orElseThrow(() -> new IllegalArgumentException("Cannot add unregistered attribute")).a().toString());
      if ($$2 != null) {
         $$4.a("Slot", $$2.e());
      }

      $$3.add($$4);
   }

   public vs K() {
      wg $$0 = vs.i().b(this.z());
      if (this.B()) {
         $$0.a(n.u);
      }

      wg $$1 = vv.a((vs)$$0);
      if (!this.b()) {
         $$1.a(this.D().e).a($$0x -> $$0x.a(new vy(vy.a.b, new vy.c(this))));
      }

      return $$1;
   }

   public boolean a(ix<czf> $$0, dmi $$1) {
      if (this.F == null) {
         this.F = new cmz("CanPlaceOn");
      }

      return this.F.a(this, $$0, $$1);
   }

   public boolean b(ix<czf> $$0, dmi $$1) {
      if (this.E == null) {
         this.E = new cmz("CanDestroy");
      }

      return this.E.a(this, $$0, $$1);
   }

   public int L() {
      return this.A;
   }

   public void e(int $$0) {
      this.A = $$0;
   }

   public int M() {
      return this.b() ? 0 : this.z;
   }

   public void f(int $$0) {
      this.z = $$0;
   }

   public void g(int $$0) {
      this.f(this.M() + $$0);
   }

   public void h(int $$0) {
      this.g(-$$0);
   }

   public void b(cwe $$0, box $$1, int $$2) {
      this.d().a($$0, $$1, this, $$2);
   }

   public void a(cel $$0) {
      this.d().a($$0);
   }

   public boolean N() {
      return this.d().v();
   }

   public ato O() {
      return this.d().ao_();
   }

   public ato P() {
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
