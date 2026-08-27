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
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class coz {
   public static final Codec<coz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               kf.h.r().fieldOf("id").forGetter(coz::e),
               Codec.INT.fieldOf("Count").forGetter(coz::M),
               sw.a.optionalFieldOf("tag").forGetter($$0x -> Optional.ofNullable($$0x.w()))
            )
            .apply($$0, coz::new)
   );
   private static final Codec<cou> p = avp.a(
      kf.h.q(), (Function<cou, DataResult<cou>>)($$0 -> $$0 == cpc.a ? DataResult.error(() -> "Item must not be minecraft:air") : DataResult.success($$0))
   );
   public static final Codec<coz> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(kf.h.r().fieldOf("item").forGetter(coz::e), avp.a(tu.i, "nbt").forGetter($$0x -> Optional.ofNullable($$0x.w())))
            .apply($$0, ($$0x, $$1) -> new coz($$0x, 1, $$1))
   );
   public static final Codec<coz> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(p.fieldOf("item").forGetter(coz::d), avp.a(avp.j, "count", Integer.valueOf(1)).forGetter(coz::M)).apply($$0, coz::new)
   );
   public static final Codec<coz> d = p.xmap(coz::new, coz::d);
   public static final MapCodec<coz> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kf.h.q().fieldOf("result").forGetter(coz::d), Codec.INT.fieldOf("count").forGetter(coz::M)).apply($$0, coz::new)
   );
   public static final xo<vb, coz> f = new xo<vb, coz>() {
      private static final xo<vb, cou> a = xm.a(kg.F);

      public coz a(vb $$0) {
         if (!$$0.readBoolean()) {
            return coz.h;
         } else {
            cou $$1 = a.decode($$0);
            int $$2 = $$0.readByte();
            coz $$3 = new coz($$1, $$2);
            $$3.c(uq.e($$0));
            return $$3;
         }
      }

      public void a(vb $$0, coz $$1) {
         if ($$1.b()) {
            $$0.a(false);
         } else {
            $$0.a(true);
            cou $$2 = $$1.d();
            a.encode($$0, $$2);
            $$0.k($$1.M());
            sw $$3 = null;
            if ($$2.n() || $$2.q()) {
               $$3 = $$1.w();
            }

            uq.a($$0, $$3);
         }
      }
   };
   public static final xo<vb, List<coz>> g = f.a(xm.a(is::a));
   private static final Logger q = LogUtils.getLogger();
   public static final coz h = new coz((Void)null);
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
   private static final vq w = vq.c("item.disabled").a(n.m);
   private static final int x = 0;
   private static final wn y = wn.a.a(n.f).b(true);
   private int z;
   private int A;
   @Deprecated
   @Nullable
   private final cou B;
   @Nullable
   private sw C;
   @Nullable
   private bno D;
   @Nullable
   private cmg E;
   @Nullable
   private cmg F;

   public Optional<cme> a() {
      return this.d().h(this);
   }

   public coz(cvm $$0) {
      this($$0, 1);
   }

   public coz(ij<cou> $$0) {
      this($$0.a(), 1);
   }

   public coz(ij<cou> $$0, int $$1, Optional<sw> $$2) {
      this($$0, $$1);
      $$2.ifPresent(this::c);
   }

   public coz(ij<cou> $$0, int $$1) {
      this($$0.a(), $$1);
   }

   public coz(cvm $$0, int $$1) {
      this.B = $$0.j();
      this.z = $$1;
      if (this.B.n()) {
         this.b(this.l());
      }
   }

   private coz(@Nullable Void $$0) {
      this.B = null;
   }

   private coz(sw $$0) {
      this.B = kf.h.a(new aiy($$0.l("id")));
      this.z = $$0.f("Count");
      if ($$0.b("tag", 10)) {
         this.C = $$0.p("tag").h();
         this.d().b(this.C);
      }

      if (this.d().n()) {
         this.b(this.l());
      }
   }

   public static coz a(sw $$0) {
      try {
         return new coz($$0);
      } catch (RuntimeException var2) {
         q.debug("Tried to load invalid item: {}", $$0, var2);
         return h;
      }
   }

   public boolean b() {
      return this == h || this.B == cpc.a || this.z <= 0;
   }

   public boolean a(cjs $$0) {
      return this.b() || this.d().a($$0);
   }

   public coz a(int $$0) {
      int $$1 = Math.min($$0, this.M());
      coz $$2 = this.c($$1);
      this.h($$1);
      return $$2;
   }

   public coz c() {
      if (this.b()) {
         return h;
      } else {
         coz $$0 = this.q();
         this.f(0);
         return $$0;
      }
   }

   public cou d() {
      return this.b() ? cpc.a : this.B;
   }

   public ij<cou> e() {
      return this.d().i();
   }

   public boolean a(auo<cou> $$0) {
      return this.d().i().a($$0);
   }

   public boolean a(cou $$0) {
      return this.d() == $$0;
   }

   public boolean a(Predicate<ij<cou>> $$0) {
      return $$0.test(this.d().i());
   }

   public boolean a(ij<cou> $$0) {
      return this.d().i() == $$0;
   }

   public boolean a(in<cou> $$0) {
      return $$0.a(this.e());
   }

   public Stream<auo<cou>> f() {
      return this.d().i().c();
   }

   public blu a(cri $$0) {
      chh $$1 = $$0.o();
      hz $$2 = $$0.a();
      dlj $$3 = new dlj($$0.q(), $$2, false);
      if ($$1 != null && !$$1.fU().e && !this.a($$0.q().I_().d(kg.f), $$3)) {
         return blu.d;
      } else {
         cou $$4 = this.d();
         blu $$5 = $$4.a($$0);
         if ($$1 != null && $$5.c()) {
            $$1.b(atu.c.b($$4));
         }

         return $$5;
      }
   }

   public float a(dlf $$0) {
      return this.d().a(this, $$0);
   }

   public blv<coz> a(cvn $$0, chh $$1, blt $$2) {
      return this.d().a($$0, $$1, $$2);
   }

   public coz a(cvn $$0, bog $$1) {
      return this.d().a(this, $$0, $$1);
   }

   public sw b(sw $$0) {
      aiy $$1 = kf.h.b(this.d());
      $$0.a("id", $$1 == null ? "minecraft:air" : $$1.toString());
      $$0.a("Count", (byte)this.z);
      if (this.C != null) {
         $$0.a("tag", this.C.h());
      }

      return $$0;
   }

   public int g() {
      return this.d().k();
   }

   public boolean h() {
      return this.g() > 1 && (!this.i() || !this.k());
   }

   public boolean i() {
      return !this.b() && this.d().l() > 0 ? !this.j() : false;
   }

   public boolean j() {
      sw $$0 = this.w();
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
      return this.d().l();
   }

   public void a(int $$0, awo $$1, @Nullable aow $$2, Runnable $$3) {
      if (this.i()) {
         if ($$0 > 0) {
            int $$4 = ctj.a(ctl.w, this);
            int $$5 = 0;

            for (int $$6 = 0; $$4 > 0 && $$6 < $$0; $$6++) {
               if (ctg.a(this, $$4, $$1)) {
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

   public void a(int $$0, bog $$1, bnv $$2) {
      if (!$$1.dM().B && (!($$1 instanceof chh) || !((chh)$$1).fU().d)) {
         this.a($$0, $$1.eh(), $$1 instanceof aow $$3 ? $$3 : null, () -> {
            $$1.d($$2);
            cou $$2x = this.d();
            this.h(1);
            if ($$1 instanceof chh) {
               ((chh)$$1).b(atu.d.b($$2x));
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

   public boolean a(clw $$0, ckj $$1, chh $$2) {
      return this.d().a(this, $$0, $$1, $$2);
   }

   public boolean a(coz $$0, clw $$1, ckj $$2, chh $$3, box $$4) {
      return this.d().a(this, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(bog $$0, chh $$1) {
      cou $$2 = this.d();
      if ($$2.a(this, $$0, $$1)) {
         $$1.b(atu.c.b($$2));
      }
   }

   public void a(cvn $$0, dlf $$1, hz $$2, chh $$3) {
      cou $$4 = this.d();
      if ($$4.a(this, $$0, $$1, $$2, $$3)) {
         $$3.b(atu.c.b($$4));
      }
   }

   public boolean b(dlf $$0) {
      return this.d().a_($$0);
   }

   public blu a(chh $$0, bog $$1, blt $$2) {
      return this.d().a(this, $$0, $$1, $$2);
   }

   public coz q() {
      if (this.b()) {
         return h;
      } else {
         coz $$0 = new coz(this.d(), this.z);
         $$0.e(this.L());
         if (this.C != null) {
            $$0.C = this.C.h();
         }

         return $$0;
      }
   }

   public coz c(int $$0) {
      if (this.b()) {
         return h;
      } else {
         coz $$1 = this.q();
         $$1.f($$0);
         return $$1;
      }
   }

   public static boolean a(coz $$0, coz $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return $$0.M() != $$1.M() ? false : c($$0, $$1);
      }
   }

   public static boolean b(coz $$0, coz $$1) {
      return $$0.a($$1.d());
   }

   public static boolean c(coz $$0, coz $$1) {
      if (!$$0.a($$1.d())) {
         return false;
      } else {
         return $$0.b() && $$1.b() ? true : Objects.equals($$0.C, $$1.C);
      }
   }

   public String r() {
      return this.d().j(this);
   }

   @Override
   public String toString() {
      return this.M() + " " + this.d();
   }

   public void a(cvn $$0, bno $$1, int $$2, boolean $$3) {
      if (this.A > 0) {
         this.A--;
      }

      if (this.d() != null) {
         this.d().a(this, $$0, $$1, $$2, $$3);
      }
   }

   public void a(cvn $$0, chh $$1, int $$2) {
      $$1.a(atu.b.b(this.d()), $$2);
      this.d().b(this, $$0, $$1);
   }

   public void a(cvn $$0) {
      this.d().a(this, $$0);
   }

   public int s() {
      return this.d().b(this);
   }

   public cqs t() {
      return this.d().c(this);
   }

   public void a(cvn $$0, bog $$1, int $$2) {
      this.d().a(this, $$0, $$1, $$2);
   }

   public boolean u() {
      return this.d().l(this);
   }

   public boolean v() {
      return !this.b() && this.C != null && !this.C.g();
   }

   @Nullable
   public sw w() {
      return this.C;
   }

   public sw x() {
      if (this.C == null) {
         this.c(new sw());
      }

      return this.C;
   }

   public sw a(String $$0) {
      if (this.C != null && this.C.b($$0, 10)) {
         return this.C.p($$0);
      } else {
         sw $$1 = new sw();
         this.a($$0, $$1);
         return $$1;
      }
   }

   @Nullable
   public sw b(String $$0) {
      return this.C != null && this.C.b($$0, 10) ? this.C.p($$0) : null;
   }

   public void c(String $$0) {
      if (this.C != null && this.C.e($$0)) {
         this.C.r($$0);
         if (this.C.g()) {
            this.C = null;
         }
      }
   }

   public tc y() {
      return this.C != null ? this.C.c("Enchantments", 10) : new tc();
   }

   public void c(@Nullable sw $$0) {
      this.C = $$0;
      if (this.d().n()) {
         this.b(this.l());
      }

      if ($$0 != null) {
         this.d().b($$0);
      }
   }

   public vq z() {
      sw $$0 = this.b("display");
      if ($$0 != null && $$0.b("Name", 8)) {
         try {
            vq $$1 = vq.a.a($$0.l("Name"));
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

   public coz a(@Nullable vq $$0) {
      sw $$1 = this.a("display");
      if ($$0 != null) {
         $$1.a("Name", vq.a.a($$0));
      } else {
         $$1.r("Name");
      }

      return this;
   }

   public void A() {
      sw $$0 = this.b("display");
      if ($$0 != null) {
         $$0.r("Name");
         if ($$0.g()) {
            this.c("display");
         }
      }

      if (this.C != null && this.C.g()) {
         this.C = null;
      }
   }

   public boolean B() {
      sw $$0 = this.b("display");
      return $$0 != null && $$0.b("Name", 8);
   }

   public List<vq> a(@Nullable chh $$0, cqq $$1) {
      List<vq> $$2 = Lists.newArrayList();
      we $$3 = vq.i().b(this.z()).a(this.D().e);
      if (this.B()) {
         $$3.a(n.u);
      }

      $$2.add($$3);
      if (!$$1.a() && !this.B() && this.a(cpc.rT)) {
         Integer $$4 = cpg.d(this);
         if ($$4 != null) {
            $$2.add(cpg.k(this));
         }
      }

      int $$5 = this.Q();
      if (a($$5, coz.a.f)) {
         this.d().a(this, $$0 == null ? null : $$0.dM(), $$2, $$1);
      }

      if (this.v()) {
         if (a($$5, coz.a.h) && $$0 != null) {
            cra.a(this, $$0.dM().I_(), $$2);
         }

         if (a($$5, coz.a.a)) {
            a($$2, this.y());
         }

         if (this.C.b("display", 10)) {
            sw $$6 = this.C.p("display");
            if (a($$5, coz.a.g) && $$6.b("color", 99)) {
               if ($$1.a()) {
                  $$2.add(vq.a("item.color", String.format(Locale.ROOT, "#%06X", $$6.h("color"))).a(n.h));
               } else {
                  $$2.add(vq.c("item.dyed").a(n.h, n.u));
               }
            }

            if ($$6.d("Lore") == 9) {
               tc $$7 = $$6.c("Lore", 8);

               for (int $$8 = 0; $$8 < $$7.size(); $$8++) {
                  String $$9 = $$7.j($$8);

                  try {
                     we $$10 = vq.a.a($$9);
                     if ($$10 != null) {
                        $$2.add(vt.a($$10, y));
                     }
                  } catch (Exception var19) {
                     $$6.r("Lore");
                  }
               }
            }
         }
      }

      if (a($$5, coz.a.b)) {
         for (bnv $$12 : bnv.values()) {
            Multimap<ij<bpg>, bpj> $$13 = this.a($$12);
            if (!$$13.isEmpty()) {
               $$2.add(vp.a);
               $$2.add(vq.c("item.modifiers." + $$12.e()).a(n.h));

               for (Entry<ij<bpg>, bpj> $$14 : $$13.entries()) {
                  bpj $$15 = $$14.getValue();
                  double $$16 = $$15.c();
                  boolean $$17 = false;
                  if ($$0 != null) {
                     if ($$15.a() == cou.m) {
                        $$16 += $$0.h(bpl.c);
                        $$16 += (double)ctj.a(this, null);
                        $$17 = true;
                     } else if ($$15.a() == cou.n) {
                        $$16 += $$0.h(bpl.e);
                        $$17 = true;
                     }
                  }

                  double $$18;
                  if ($$15.b() == bpj.a.b || $$15.b() == bpj.a.c) {
                     $$18 = $$16 * 100.0;
                  } else if ($$14.getKey().a(bpl.k)) {
                     $$18 = $$16 * 10.0;
                  } else {
                     $$18 = $$16;
                  }

                  if ($$17) {
                     $$2.add(vp.a().b(vq.a("attribute.modifier.equals." + $$15.b().a(), i.format($$18), vq.c($$14.getKey().a().c()))).a(n.c));
                  } else if ($$16 > 0.0) {
                     $$2.add(vq.a("attribute.modifier.plus." + $$15.b().a(), i.format($$18), vq.c($$14.getKey().a().c())).a(n.j));
                  } else if ($$16 < 0.0) {
                     $$18 *= -1.0;
                     $$2.add(vq.a("attribute.modifier.take." + $$15.b().a(), i.format($$18), vq.c($$14.getKey().a().c())).a(n.m));
                  }
               }
            }
         }
      }

      if (this.v()) {
         if (a($$5, coz.a.c) && this.C.q("Unbreakable")) {
            $$2.add(vq.c("item.unbreakable").a(n.j));
         }

         if (a($$5, coz.a.d) && this.C.b("CanDestroy", 9)) {
            tc $$21 = this.C.c("CanDestroy", 8);
            if (!$$21.isEmpty()) {
               $$2.add(vp.a);
               $$2.add(vq.c("item.canBreak").a(n.h));

               for (int $$22 = 0; $$22 < $$21.size(); $$22++) {
                  $$2.addAll(d($$21.j($$22)));
               }
            }
         }

         if (a($$5, coz.a.e) && this.C.b("CanPlaceOn", 9)) {
            tc $$23 = this.C.c("CanPlaceOn", 8);
            if (!$$23.isEmpty()) {
               $$2.add(vp.a);
               $$2.add(vq.c("item.canPlace").a(n.h));

               for (int $$24 = 0; $$24 < $$23.size(); $$24++) {
                  $$2.addAll(d($$23.j($$24)));
               }
            }
         }
      }

      if ($$1.a()) {
         if (this.k()) {
            $$2.add(vq.a("item.durability", this.m() - this.l(), this.m()));
         }

         $$2.add(vq.b(kf.h.b(this.d()).toString()).a(n.i));
         if (this.v()) {
            $$2.add(vq.a("item.nbt_tags", this.C.e().size()).a(n.i));
         }
      }

      if ($$0 != null && !this.d().a($$0.dM().I())) {
         $$2.add(w);
      }

      return $$2;
   }

   private static boolean a(int $$0, coz.a $$1) {
      return ($$0 & $$1.a()) == 0;
   }

   private int Q() {
      return this.v() && this.C.b("HideFlags", 99) ? this.C.h("HideFlags") : 0;
   }

   public void a(coz.a $$0) {
      sw $$1 = this.x();
      $$1.a("HideFlags", $$1.h("HideFlags") | $$0.a());
   }

   public static void a(List<vq> $$0, tc $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         sw $$3 = $$1.a($$2);
         kf.f.b(ctj.b($$3)).ifPresent($$2x -> $$0.add($$2x.d(ctj.a($$3))));
      }
   }

   private static Collection<vq> d(String $$0) {
      try {
         return (Collection<vq>)fm.b(kf.e.p(), $$0, true)
            .map(
               $$0x -> Lists.newArrayList(new vq[]{$$0x.a().b().f().a(n.i)}),
               $$0x -> $$0x.a().a().map($$0xx -> ((cyo)$$0xx.a()).f().a(n.i)).collect(Collectors.toList())
            );
      } catch (CommandSyntaxException var2) {
         return Lists.newArrayList(new vq[]{vq.b("missingno").a(n.i)});
      }
   }

   public boolean C() {
      return this.d().i(this);
   }

   public cpq D() {
      return this.d().n(this);
   }

   public boolean E() {
      return !this.d().d_(this) ? false : !this.F();
   }

   public void a(cti $$0, int $$1) {
      this.x();
      if (!this.C.b("Enchantments", 9)) {
         this.C.a("Enchantments", new tc());
      }

      tc $$2 = this.C.c("Enchantments", 10);
      $$2.add(ctj.a(ctj.a($$0), (byte)$$1));
   }

   public boolean F() {
      return this.C != null && this.C.b("Enchantments", 9) ? !this.C.c("Enchantments", 10).isEmpty() : false;
   }

   public void a(String $$0, tt $$1) {
      this.x().a($$0, $$1);
   }

   public boolean G() {
      return this.D instanceof cdl;
   }

   public void a(@Nullable bno $$0) {
      this.D = $$0;
   }

   @Nullable
   public cdl H() {
      return this.D instanceof cdl ? (cdl)this.I() : null;
   }

   @Nullable
   public bno I() {
      return !this.b() ? this.D : null;
   }

   public int J() {
      return this.v() && this.C.b("RepairCost", 3) ? this.C.h("RepairCost") : 0;
   }

   public void d(int $$0) {
      if ($$0 > 0) {
         this.x().a("RepairCost", $$0);
      } else {
         this.c("RepairCost");
      }
   }

   public Multimap<ij<bpg>, bpj> a(bnv $$0) {
      Multimap<ij<bpg>, bpj> $$1;
      if (this.v() && this.C.b("AttributeModifiers", 9)) {
         $$1 = HashMultimap.create();
         tc $$2 = this.C.c("AttributeModifiers", 10);

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            sw $$4 = $$2.a($$3);
            if (!$$4.b("Slot", 8) || $$4.l("Slot").equals($$0.e())) {
               aiy $$5 = aiy.a($$4.l("AttributeName"));
               if ($$5 != null) {
                  Optional<ij.c<bpg>> $$6 = kf.u.c($$5);
                  if (!$$6.isEmpty()) {
                     bpj $$7 = bpj.a($$4);
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

   public void a(ij<bpg> $$0, bpj $$1, @Nullable bnv $$2) {
      this.x();
      if (!this.C.b("AttributeModifiers", 9)) {
         this.C.a("AttributeModifiers", new tc());
      }

      tc $$3 = this.C.c("AttributeModifiers", 10);
      sw $$4 = $$1.d();
      $$4.a("AttributeName", $$0.e().orElseThrow(() -> new IllegalArgumentException("Cannot add unregistered attribute")).a().toString());
      if ($$2 != null) {
         $$4.a("Slot", $$2.e());
      }

      $$3.add($$4);
   }

   public vq K() {
      we $$0 = vq.i().b(this.z());
      if (this.B()) {
         $$0.a(n.u);
      }

      we $$1 = vt.a((vq)$$0);
      if (!this.b()) {
         $$1.a(this.D().e).a($$0x -> $$0x.a(new vw(vw.a.b, new vw.c(this))));
      }

      return $$1;
   }

   public boolean a(iv<cyo> $$0, dlj $$1) {
      if (this.F == null) {
         this.F = new cmg("CanPlaceOn");
      }

      return this.F.a(this, $$0, $$1);
   }

   public boolean b(iv<cyo> $$0, dlj $$1) {
      if (this.E == null) {
         this.E = new cmg("CanDestroy");
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

   public void b(cvn $$0, bog $$1, int $$2) {
      this.d().a($$0, $$1, this, $$2);
   }

   public void a(cds $$0) {
      this.d().a($$0);
   }

   public boolean N() {
      return this.d().t();
   }

   public atj O() {
      return this.d().ap_();
   }

   public atj P() {
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
