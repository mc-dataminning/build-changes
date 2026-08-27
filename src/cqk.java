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

public final class cqk {
   public static final Codec<cqk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ki.h.r().fieldOf("id").forGetter(cqk::e),
               Codec.INT.fieldOf("Count").forGetter(cqk::M),
               ta.a.optionalFieldOf("tag").forGetter($$0x -> Optional.ofNullable($$0x.w()))
            )
            .apply($$0, cqk::new)
   );
   private static final Codec<cqf> p = awe.b(
      ki.h.q(), (Function<cqf, DataResult<cqf>>)($$0 -> $$0 == cqn.a ? DataResult.error(() -> "Item must not be minecraft:air") : DataResult.success($$0))
   );
   public static final Codec<cqk> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(ki.h.r().fieldOf("item").forGetter(cqk::e), awe.a(ty.i, "nbt").forGetter($$0x -> Optional.ofNullable($$0x.w())))
            .apply($$0, ($$0x, $$1) -> new cqk($$0x, 1, $$1))
   );
   public static final Codec<cqk> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(p.fieldOf("item").forGetter(cqk::d), awe.a(awe.k, "count", Integer.valueOf(1)).forGetter(cqk::M)).apply($$0, cqk::new)
   );
   public static final Codec<cqk> d = p.xmap(cqk::new, cqk::d);
   public static final MapCodec<cqk> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ki.h.q().fieldOf("result").forGetter(cqk::d), Codec.INT.fieldOf("count").forGetter(cqk::M)).apply($$0, cqk::new)
   );
   public static final xs<vf, cqk> f = new xs<vf, cqk>() {
      private static final xs<vf, cqf> a = xq.a(kj.F);

      public cqk a(vf $$0) {
         if (!$$0.readBoolean()) {
            return cqk.h;
         } else {
            cqf $$1 = a.decode($$0);
            int $$2 = $$0.readByte();
            cqk $$3 = new cqk($$1, $$2);
            $$3.c(uu.f($$0));
            return $$3;
         }
      }

      public void a(vf $$0, cqk $$1) {
         if ($$1.b()) {
            $$0.a(false);
         } else {
            $$0.a(true);
            cqf $$2 = $$1.d();
            a.encode($$0, $$2);
            $$0.k($$1.M());
            ta $$3 = null;
            if ($$2.p() || $$2.s()) {
               $$3 = $$1.w();
            }

            uu.a($$0, $$3);
         }
      }
   };
   public static final xs<vf, List<cqk>> g = f.a(xq.a(iu::a));
   private static final Logger q = LogUtils.getLogger();
   public static final cqk h = new cqk((Void)null);
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
   private static final vu w = vu.c("item.disabled").a(n.m);
   private static final int x = 0;
   private static final wr y = wr.a.a(n.f).b(true);
   private int z;
   private int A;
   @Deprecated
   @Nullable
   private final cqf B;
   @Nullable
   private ta C;
   @Nullable
   private bow D;
   @Nullable
   private cnt E;
   @Nullable
   private cnt F;

   public Optional<cnr> a() {
      return this.d().h(this);
   }

   public cqk(cwy $$0) {
      this($$0, 1);
   }

   public cqk(il<cqf> $$0) {
      this($$0.a(), 1);
   }

   public cqk(il<cqf> $$0, int $$1, Optional<ta> $$2) {
      this($$0, $$1);
      $$2.ifPresent(this::c);
   }

   public cqk(il<cqf> $$0, int $$1) {
      this($$0.a(), $$1);
   }

   public cqk(cwy $$0, int $$1) {
      this.B = $$0.l();
      this.z = $$1;
      if (this.B.p()) {
         this.b(this.l());
      }
   }

   private cqk(@Nullable Void $$0) {
      this.B = null;
   }

   private cqk(ta $$0) {
      this.B = ki.h.a(new ajh($$0.l("id")));
      this.z = $$0.f("Count");
      if ($$0.b("tag", 10)) {
         this.C = $$0.p("tag").h();
         this.d().b(this.C);
      }

      if (this.d().p()) {
         this.b(this.l());
      }
   }

   public static cqk a(ta $$0) {
      try {
         return new cqk($$0);
      } catch (RuntimeException var2) {
         q.debug("Tried to load invalid item: {}", $$0, var2);
         return h;
      }
   }

   public boolean b() {
      return this == h || this.B == cqn.a || this.z <= 0;
   }

   public boolean a(clf $$0) {
      return this.b() || this.d().a($$0);
   }

   public cqk a(int $$0) {
      int $$1 = Math.min($$0, this.M());
      cqk $$2 = this.c($$1);
      this.h($$1);
      return $$2;
   }

   public cqk c() {
      if (this.b()) {
         return h;
      } else {
         cqk $$0 = this.q();
         this.f(0);
         return $$0;
      }
   }

   public cqf d() {
      return this.b() ? cqn.a : this.B;
   }

   public il<cqf> e() {
      return this.d().k();
   }

   public boolean a(avd<cqf> $$0) {
      return this.d().k().a($$0);
   }

   public boolean a(cqf $$0) {
      return this.d() == $$0;
   }

   public boolean a(Predicate<il<cqf>> $$0) {
      return $$0.test(this.d().k());
   }

   public boolean a(il<cqf> $$0) {
      return this.d().k() == $$0;
   }

   public boolean a(ip<cqf> $$0) {
      return $$0.a(this.e());
   }

   public Stream<avd<cqf>> f() {
      return this.d().k().c();
   }

   public bnc a(csu $$0) {
      cis $$1 = $$0.o();
      ib $$2 = $$0.a();
      dnd $$3 = new dnd($$0.q(), $$2, false);
      if ($$1 != null && !$$1.ga().e && !this.a($$0.q().H_().d(kj.f), $$3)) {
         return bnc.d;
      } else {
         cqf $$4 = this.d();
         bnc $$5 = $$4.a($$0);
         if ($$1 != null && $$5.c()) {
            $$1.b(aui.c.b($$4));
         }

         return $$5;
      }
   }

   public float a(dmz $$0) {
      return this.d().a(this, $$0);
   }

   public bnd<cqk> a(cwz $$0, cis $$1, bnb $$2) {
      return this.d().a($$0, $$1, $$2);
   }

   public cqk a(cwz $$0, bpo $$1) {
      return this.d().a(this, $$0, $$1);
   }

   public ta b(ta $$0) {
      ajh $$1 = ki.h.b(this.d());
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
      ta $$0 = this.w();
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

   public void a(int $$0, axd $$1, @Nullable apg $$2, Runnable $$3) {
      if (this.i()) {
         if ($$0 > 0) {
            int $$4 = cuv.a(cux.w, this);
            int $$5 = 0;

            for (int $$6 = 0; $$4 > 0 && $$6 < $$0; $$6++) {
               if (cus.a(this, $$4, $$1)) {
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

   public void a(int $$0, bpo $$1, bpd $$2) {
      if (!$$1.dM().B) {
         if ($$1 instanceof cis $$3 && $$3.fM()) {
            return;
         }

         this.a($$0, $$1.ei(), $$1 instanceof apg $$4 ? $$4 : null, () -> {
            $$1.e($$2);
            cqf $$2x = this.d();
            this.h(1);
            if ($$1 instanceof cis) {
               ((cis)$$1).b(aui.d.b($$2x));
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

   public boolean a(cnj $$0, clw $$1, cis $$2) {
      return this.d().a(this, $$0, $$1, $$2);
   }

   public boolean a(cqk $$0, cnj $$1, clw $$2, cis $$3, bqf $$4) {
      return this.d().a(this, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(bpo $$0, cis $$1) {
      cqf $$2 = this.d();
      if ($$2.a(this, $$0, $$1)) {
         $$1.b(aui.c.b($$2));
      }
   }

   public void a(cwz $$0, dmz $$1, ib $$2, cis $$3) {
      cqf $$4 = this.d();
      if ($$4.a(this, $$0, $$1, $$2, $$3)) {
         $$3.b(aui.c.b($$4));
      }
   }

   public boolean b(dmz $$0) {
      return this.d().a_($$0);
   }

   public bnc a(cis $$0, bpo $$1, bnb $$2) {
      return this.d().a(this, $$0, $$1, $$2);
   }

   public cqk q() {
      if (this.b()) {
         return h;
      } else {
         cqk $$0 = new cqk(this.d(), this.z);
         $$0.e(this.L());
         if (this.C != null) {
            $$0.C = this.C.h();
         }

         return $$0;
      }
   }

   public cqk c(int $$0) {
      if (this.b()) {
         return h;
      } else {
         cqk $$1 = this.q();
         $$1.f($$0);
         return $$1;
      }
   }

   public cqk a(cwy $$0, int $$1) {
      return this.b() ? h : this.b($$0, $$1);
   }

   public cqk b(cwy $$0, int $$1) {
      cqk $$2 = new cqk($$0, $$1);
      if (this.C != null) {
         $$2.c(this.C.h());
      }

      return $$2;
   }

   public static boolean a(cqk $$0, cqk $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return $$0.M() != $$1.M() ? false : c($$0, $$1);
      }
   }

   public static boolean b(cqk $$0, cqk $$1) {
      return $$0.a($$1.d());
   }

   public static boolean c(cqk $$0, cqk $$1) {
      if (!$$0.a($$1.d())) {
         return false;
      } else {
         return $$0.b() && $$1.b() ? true : Objects.equals($$0.C, $$1.C);
      }
   }

   public static MapCodec<cqk> a(String $$0) {
      return a.optionalFieldOf($$0).xmap($$0x -> $$0x.orElse(h), $$0x -> $$0x.b() ? Optional.empty() : Optional.of($$0x));
   }

   public String r() {
      return this.d().j(this);
   }

   @Override
   public String toString() {
      return this.M() + " " + this.d();
   }

   public void a(cwz $$0, bow $$1, int $$2, boolean $$3) {
      if (this.A > 0) {
         this.A--;
      }

      if (this.d() != null) {
         this.d().a(this, $$0, $$1, $$2, $$3);
      }
   }

   public void a(cwz $$0, cis $$1, int $$2) {
      $$1.a(aui.b.b(this.d()), $$2);
      this.d().b(this, $$0, $$1);
   }

   public void a(cwz $$0) {
      this.d().a(this, $$0);
   }

   public int s() {
      return this.d().b(this);
   }

   public csd t() {
      return this.d().c(this);
   }

   public void a(cwz $$0, bpo $$1, int $$2) {
      this.d().a(this, $$0, $$1, $$2);
   }

   public boolean u() {
      return this.d().l(this);
   }

   public boolean v() {
      return !this.b() && this.C != null && !this.C.g();
   }

   @Nullable
   public ta w() {
      return this.C;
   }

   public ta x() {
      if (this.C == null) {
         this.c(new ta());
      }

      return this.C;
   }

   public ta b(String $$0) {
      if (this.C != null && this.C.b($$0, 10)) {
         return this.C.p($$0);
      } else {
         ta $$1 = new ta();
         this.a($$0, $$1);
         return $$1;
      }
   }

   @Nullable
   public ta c(String $$0) {
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

   public tg y() {
      return this.C != null ? this.C.c("Enchantments", 10) : new tg();
   }

   public void c(@Nullable ta $$0) {
      this.C = $$0;
      if (this.d().p()) {
         this.b(this.l());
      }

      if ($$0 != null) {
         this.d().b($$0);
      }
   }

   public vu z() {
      ta $$0 = this.c("display");
      if ($$0 != null && $$0.b("Name", 8)) {
         try {
            vu $$1 = vu.a.a($$0.l("Name"));
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

   public cqk a(@Nullable vu $$0) {
      ta $$1 = this.b("display");
      if ($$0 != null) {
         $$1.a("Name", vu.a.a($$0));
      } else {
         $$1.r("Name");
      }

      return this;
   }

   public void A() {
      ta $$0 = this.c("display");
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
      ta $$0 = this.c("display");
      return $$0 != null && $$0.b("Name", 8);
   }

   public List<vu> a(@Nullable cis $$0, csb $$1) {
      List<vu> $$2 = Lists.newArrayList();
      wi $$3 = vu.i().b(this.z()).a(this.D().e);
      if (this.B()) {
         $$3.a(n.u);
      }

      $$2.add($$3);
      if (!$$1.a() && !this.B() && this.a(cqn.rT)) {
         ejw $$4 = cqr.d(this);
         if ($$4 != null) {
            $$2.add(cqr.k(this));
         }
      }

      int $$5 = this.Q();
      if (a($$5, cqk.a.f)) {
         this.d().a(this, $$0 == null ? null : $$0.dM(), $$2, $$1);
         a($$2, cph.d(this));
      }

      if (a($$5, cqk.a.h) && $$0 != null) {
         csm.a(this, $$0.dM().H_(), $$2);
      }

      if (a($$5, cqk.a.a)) {
         a($$2, this.y());
      }

      if (this.C != null && this.C.b("display", 10)) {
         ta $$6 = this.C.p("display");
         if (a($$5, cqk.a.g) && $$6.b("color", 99)) {
            if ($$1.a()) {
               $$2.add(vu.a("item.color", String.format(Locale.ROOT, "#%06X", $$6.h("color"))).a(n.h));
            } else {
               $$2.add(vu.c("item.dyed").a(n.h, n.u));
            }
         }

         if ($$6.d("Lore") == 9) {
            tg $$7 = $$6.c("Lore", 8);

            for (int $$8 = 0; $$8 < $$7.size(); $$8++) {
               String $$9 = $$7.j($$8);

               try {
                  wi $$10 = vu.a.a($$9);
                  if ($$10 != null) {
                     $$2.add(vx.a($$10, y));
                  }
               } catch (Exception var19) {
                  $$6.r("Lore");
               }
            }
         }
      }

      if (a($$5, cqk.a.b)) {
         for (bpd $$12 : bpd.values()) {
            Multimap<il<bqq>, bqt> $$13 = this.a($$12);
            if (!$$13.isEmpty()) {
               $$2.add(vt.a);
               $$2.add(vu.c("item.modifiers." + $$12.e()).a(n.h));

               for (Entry<il<bqq>, bqt> $$14 : $$13.entries()) {
                  bqt $$15 = $$14.getValue();
                  double $$16 = $$15.c();
                  boolean $$17 = false;
                  if ($$0 != null) {
                     if ($$15.a() == cqf.m) {
                        $$16 += $$0.h(bqv.c);
                        $$16 += (double)cuv.a(this, null);
                        $$17 = true;
                     } else if ($$15.a() == cqf.n) {
                        $$16 += $$0.h(bqv.e);
                        $$17 = true;
                     }
                  }

                  double $$18;
                  if ($$15.b() == bqt.a.b || $$15.b() == bqt.a.c) {
                     $$18 = $$16 * 100.0;
                  } else if ($$14.getKey().a(bqv.n)) {
                     $$18 = $$16 * 10.0;
                  } else {
                     $$18 = $$16;
                  }

                  if ($$17) {
                     $$2.add(vt.a().b(vu.a("attribute.modifier.equals." + $$15.b().a(), i.format($$18), vu.c($$14.getKey().a().c()))).a(n.c));
                  } else if ($$16 > 0.0) {
                     $$2.add(vu.a("attribute.modifier.plus." + $$15.b().a(), i.format($$18), vu.c($$14.getKey().a().c())).a(n.j));
                  } else if ($$16 < 0.0) {
                     $$18 *= -1.0;
                     $$2.add(vu.a("attribute.modifier.take." + $$15.b().a(), i.format($$18), vu.c($$14.getKey().a().c())).a(n.m));
                  }
               }
            }
         }
      }

      if (a($$5, cqk.a.c) && this.C != null && this.C.q("Unbreakable")) {
         $$2.add(vu.c("item.unbreakable").a(n.j));
      }

      if (a($$5, cqk.a.d) && this.C != null && this.C.b("CanDestroy", 9)) {
         tg $$21 = this.C.c("CanDestroy", 8);
         if (!$$21.isEmpty()) {
            $$2.add(vt.a);
            $$2.add(vu.c("item.canBreak").a(n.h));

            for (int $$22 = 0; $$22 < $$21.size(); $$22++) {
               $$2.addAll(e($$21.j($$22)));
            }
         }
      }

      if (a($$5, cqk.a.e) && this.C != null && this.C.b("CanPlaceOn", 9)) {
         tg $$23 = this.C.c("CanPlaceOn", 8);
         if (!$$23.isEmpty()) {
            $$2.add(vt.a);
            $$2.add(vu.c("item.canPlace").a(n.h));

            for (int $$24 = 0; $$24 < $$23.size(); $$24++) {
               $$2.addAll(e($$23.j($$24)));
            }
         }
      }

      if ($$1.a()) {
         if (this.k()) {
            $$2.add(vu.a("item.durability", this.m() - this.l(), this.m()));
         }

         $$2.add(vu.b(ki.h.b(this.d()).toString()).a(n.i));
         if (this.v()) {
            $$2.add(vu.a("item.nbt_tags", this.C.e().size()).a(n.i));
         }
      }

      if ($$0 != null && !this.d().a($$0.dM().I())) {
         $$2.add(w);
      }

      return $$2;
   }

   private static boolean a(int $$0, cqk.a $$1) {
      return ($$0 & $$1.a()) == 0;
   }

   private int Q() {
      return this.v() && this.C.b("HideFlags", 99) ? this.C.h("HideFlags") : 0;
   }

   public void a(cqk.a $$0) {
      ta $$1 = this.x();
      $$1.a("HideFlags", $$1.h("HideFlags") | $$0.a());
   }

   public static void a(List<vu> $$0, tg $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         ta $$3 = $$1.a($$2);
         ki.f.b(cuv.b($$3)).ifPresent($$2x -> $$0.add($$2x.d(cuv.a($$3))));
      }
   }

   private static Collection<vu> e(String $$0) {
      try {
         return (Collection<vu>)fm.b(ki.e.p(), $$0, true)
            .map(
               $$0x -> Lists.newArrayList(new vu[]{$$0x.a().b().f().a(n.i)}),
               $$0x -> $$0x.a().a().map($$0xx -> ((daa)$$0xx.a()).f().a(n.i)).collect(Collectors.toList())
            );
      } catch (CommandSyntaxException var2) {
         return Lists.newArrayList(new vu[]{vu.b("missingno").a(n.i)});
      }
   }

   public boolean C() {
      return this.d().i(this);
   }

   public crb D() {
      return this.d().n(this);
   }

   public boolean E() {
      return !this.d().d_(this) ? false : !this.F();
   }

   public void a(cuu $$0, int $$1) {
      Map<cuu, Integer> $$2 = cuv.a(this);
      if ($$1 != 0) {
         $$2.merge($$0, $$1, Integer::max);
      }

      cuv.a($$2, this);
   }

   public boolean F() {
      return this.C != null && this.C.b("Enchantments", 9) ? !this.C.c("Enchantments", 10).isEmpty() : false;
   }

   public void a(String $$0, tx $$1) {
      this.x().a($$0, $$1);
   }

   public boolean G() {
      return this.D instanceof cew;
   }

   public void a(@Nullable bow $$0) {
      this.D = $$0;
   }

   @Nullable
   public cew H() {
      return this.D instanceof cew ? (cew)this.I() : null;
   }

   @Nullable
   public bow I() {
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

   public Multimap<il<bqq>, bqt> a(bpd $$0) {
      Multimap<il<bqq>, bqt> $$1;
      if (this.v() && this.C.b("AttributeModifiers", 9)) {
         $$1 = HashMultimap.create();
         tg $$2 = this.C.c("AttributeModifiers", 10);

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            ta $$4 = $$2.a($$3);
            if (!$$4.b("Slot", 8) || $$4.l("Slot").equals($$0.e())) {
               ajh $$5 = ajh.a($$4.l("AttributeName"));
               if ($$5 != null) {
                  Optional<il.c<bqq>> $$6 = ki.u.c($$5);
                  if (!$$6.isEmpty()) {
                     bqt $$7 = bqt.a($$4);
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

   public void a(il<bqq> $$0, bqt $$1, @Nullable bpd $$2) {
      this.x();
      if (!this.C.b("AttributeModifiers", 9)) {
         this.C.a("AttributeModifiers", new tg());
      }

      tg $$3 = this.C.c("AttributeModifiers", 10);
      ta $$4 = $$1.d();
      $$4.a("AttributeName", $$0.e().orElseThrow(() -> new IllegalArgumentException("Cannot add unregistered attribute")).a().toString());
      if ($$2 != null) {
         $$4.a("Slot", $$2.e());
      }

      $$3.add($$4);
   }

   public vu K() {
      wi $$0 = vu.i().b(this.z());
      if (this.B()) {
         $$0.a(n.u);
      }

      wi $$1 = vx.a((vu)$$0);
      if (!this.b()) {
         $$1.a(this.D().e).a($$0x -> $$0x.a(new wa(wa.a.b, new wa.c(this))));
      }

      return $$1;
   }

   public boolean a(iy<daa> $$0, dnd $$1) {
      if (this.F == null) {
         this.F = new cnt("CanPlaceOn");
      }

      return this.F.a(this, $$0, $$1);
   }

   public boolean b(iy<daa> $$0, dnd $$1) {
      if (this.E == null) {
         this.E = new cnt("CanDestroy");
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

   public void a(int $$0, @Nullable bpo $$1) {
      if ($$1 == null || !$$1.fM()) {
         this.h($$0);
      }
   }

   public void b(cwz $$0, bpo $$1, int $$2) {
      this.d().a($$0, $$1, this, $$2);
   }

   public void a(cfd $$0) {
      this.d().a($$0);
   }

   public boolean N() {
      return this.d().v();
   }

   public atx O() {
      return this.d().an_();
   }

   public atx P() {
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
