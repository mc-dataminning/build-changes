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

public final class cfz {
   public static final Codec<cfz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jb.i.q().fieldOf("id").forGetter(cfz::d),
               Codec.INT.fieldOf("Count").forGetter(cfz::L),
               qr.a.optionalFieldOf("tag").forGetter($$0x -> Optional.ofNullable($$0x.v()))
            )
            .apply($$0, cfz::new)
   );
   private static final Logger j = LogUtils.getLogger();
   public static final cfz b = new cfz((Void)null);
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
   private static final sw p = sw.c("item.disabled").a(n.m);
   private static final int q = 0;
   private static final ts r = ts.a.a(n.f).b(true);
   private int s;
   private int t;
   @Deprecated
   @Nullable
   private final cfu u;
   @Nullable
   private qr v;
   @Nullable
   private bfj w;
   @Nullable
   private cdh x;
   @Nullable
   private cdh y;

   public Optional<cdf> a() {
      return this.d().h(this);
   }

   public cfz(cml $$0) {
      this($$0, 1);
   }

   public cfz(he<cfu> $$0) {
      this($$0.a(), 1);
   }

   private cfz(cml $$0, int $$1, Optional<qr> $$2) {
      this($$0, $$1);
      $$2.ifPresent(this::c);
   }

   public cfz(he<cfu> $$0, int $$1) {
      this($$0.a(), $$1);
   }

   public cfz(cml $$0, int $$1) {
      this.u = $$0.k();
      this.s = $$1;
      if (this.u.o()) {
         this.b(this.k());
      }
   }

   private cfz(@Nullable Void $$0) {
      this.u = null;
   }

   private cfz(qr $$0) {
      this.u = jb.i.a(new acq($$0.l("id")));
      this.s = $$0.f("Count");
      if ($$0.b("tag", 10)) {
         this.v = $$0.p("tag");
         this.d().b(this.v);
      }

      if (this.d().o()) {
         this.b(this.k());
      }
   }

   public static cfz a(qr $$0) {
      try {
         return new cfz($$0);
      } catch (RuntimeException var2) {
         j.debug("Tried to load invalid item: {}", $$0, var2);
         return b;
      }
   }

   public boolean b() {
      return this == b || this.u == cgc.a || this.s <= 0;
   }

   public boolean a(caw $$0) {
      return this.b() || this.d().a($$0);
   }

   public cfz a(int $$0) {
      int $$1 = Math.min($$0, this.L());
      cfz $$2 = this.c($$1);
      this.h($$1);
      return $$2;
   }

   public cfz c() {
      if (this.b()) {
         return b;
      } else {
         cfz $$0 = this.p();
         this.f(0);
         return $$0;
      }
   }

   public cfu d() {
      return this.b() ? cgc.a : this.u;
   }

   public he<cfu> e() {
      return this.d().j();
   }

   public boolean a(anl<cfu> $$0) {
      return this.d().j().a($$0);
   }

   public boolean a(cfu $$0) {
      return this.d() == $$0;
   }

   public boolean a(Predicate<he<cfu>> $$0) {
      return $$0.test(this.d().j());
   }

   public boolean a(he<cfu> $$0) {
      return this.d().j() == $$0;
   }

   public Stream<anl<cfu>> f() {
      return this.d().j().c();
   }

   public bdx a(cij $$0) {
      byo $$1 = $$0.o();
      gu $$2 = $$0.a();
      dcf $$3 = new dcf($$0.q(), $$2, false);
      if ($$1 != null && !$$1.fO().e && !this.a($$0.q().B_().d(jc.e), $$3)) {
         return bdx.d;
      } else {
         cfu $$4 = this.d();
         bdx $$5 = $$4.a($$0);
         if ($$1 != null && $$5.c()) {
            $$1.b(amr.c.b($$4));
         }

         return $$5;
      }
   }

   public float a(dcb $$0) {
      return this.d().a(this, $$0);
   }

   public bdy<cfz> a(cmm $$0, byo $$1, bdw $$2) {
      return this.d().a($$0, $$1, $$2);
   }

   public cfz a(cmm $$0, bfz $$1) {
      return this.d().a(this, $$0, $$1);
   }

   public qr b(qr $$0) {
      acq $$1 = jb.i.b(this.d());
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
         qr $$0 = this.v();
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

   public boolean a(int $$0, apf $$1, @Nullable aig $$2) {
      if (!this.i()) {
         return false;
      } else {
         if ($$0 > 0) {
            int $$3 = cki.a(ckk.w, this);
            int $$4 = 0;

            for (int $$5 = 0; $$3 > 0 && $$5 < $$0; $$5++) {
               if (cke.a(this, $$3, $$1)) {
                  $$4++;
               }
            }

            $$0 -= $$4;
            if ($$0 <= 0) {
               return false;
            }
         }

         if ($$2 != null && $$0 != 0) {
            ai.t.a($$2, this, this.k() + $$0);
         }

         int $$6 = this.k() + $$0;
         this.b($$6);
         return $$6 >= this.l();
      }
   }

   public <T extends bfz> void a(int $$0, T $$1, Consumer<T> $$2) {
      if (!$$1.dI().B && (!($$1 instanceof byo) || !((byo)$$1).fO().d)) {
         if (this.i()) {
            if (this.a($$0, $$1.ec(), $$1 instanceof aig ? (aig)$$1 : null)) {
               $$2.accept($$1);
               cfu $$3 = this.d();
               this.h(1);
               if ($$1 instanceof byo) {
                  ((byo)$$1).b(amr.d.b($$3));
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

   public boolean a(ccx $$0, cbn $$1, byo $$2) {
      return this.d().a(this, $$0, $$1, $$2);
   }

   public boolean a(cfz $$0, ccx $$1, cbn $$2, byo $$3, bgs $$4) {
      return this.d().a(this, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(bfz $$0, byo $$1) {
      cfu $$2 = this.d();
      if ($$2.a(this, $$0, $$1)) {
         $$1.b(amr.c.b($$2));
      }
   }

   public void a(cmm $$0, dcb $$1, gu $$2, byo $$3) {
      cfu $$4 = this.d();
      if ($$4.a(this, $$0, $$1, $$2, $$3)) {
         $$3.b(amr.c.b($$4));
      }
   }

   public boolean b(dcb $$0) {
      return this.d().a_($$0);
   }

   public bdx a(byo $$0, bfz $$1, bdw $$2) {
      return this.d().a(this, $$0, $$1, $$2);
   }

   public cfz p() {
      if (this.b()) {
         return b;
      } else {
         cfz $$0 = new cfz(this.d(), this.s);
         $$0.e(this.K());
         if (this.v != null) {
            $$0.v = this.v.h();
         }

         return $$0;
      }
   }

   public cfz c(int $$0) {
      if (this.b()) {
         return b;
      } else {
         cfz $$1 = this.p();
         $$1.f($$0);
         return $$1;
      }
   }

   public static boolean a(cfz $$0, cfz $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return $$0.L() != $$1.L() ? false : c($$0, $$1);
      }
   }

   public static boolean b(cfz $$0, cfz $$1) {
      return $$0.a($$1.d());
   }

   public static boolean c(cfz $$0, cfz $$1) {
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

   public void a(cmm $$0, bfj $$1, int $$2, boolean $$3) {
      if (this.t > 0) {
         this.t--;
      }

      if (this.d() != null) {
         this.d().a(this, $$0, $$1, $$2, $$3);
      }
   }

   public void a(cmm $$0, byo $$1, int $$2) {
      $$1.a(amr.b.b(this.d()), $$2);
      this.d().b(this, $$0, $$1);
   }

   public int r() {
      return this.d().b(this);
   }

   public chs s() {
      return this.d().c(this);
   }

   public void a(cmm $$0, bfz $$1, int $$2) {
      this.d().a(this, $$0, $$1, $$2);
   }

   public boolean t() {
      return this.d().l(this);
   }

   public boolean u() {
      return !this.b() && this.v != null && !this.v.g();
   }

   @Nullable
   public qr v() {
      return this.v;
   }

   public qr w() {
      if (this.v == null) {
         this.c(new qr());
      }

      return this.v;
   }

   public qr a(String $$0) {
      if (this.v != null && this.v.b($$0, 10)) {
         return this.v.p($$0);
      } else {
         qr $$1 = new qr();
         this.a($$0, $$1);
         return $$1;
      }
   }

   @Nullable
   public qr b(String $$0) {
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

   public qx x() {
      return this.v != null ? this.v.c("Enchantments", 10) : new qx();
   }

   public void c(@Nullable qr $$0) {
      this.v = $$0;
      if (this.d().o()) {
         this.b(this.k());
      }

      if ($$0 != null) {
         this.d().b($$0);
      }
   }

   public sw y() {
      qr $$0 = this.b("display");
      if ($$0 != null && $$0.b("Name", 8)) {
         try {
            sw $$1 = sw.a.a($$0.l("Name"));
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

   public cfz a(@Nullable sw $$0) {
      qr $$1 = this.a("display");
      if ($$0 != null) {
         $$1.a("Name", sw.a.a($$0));
      } else {
         $$1.r("Name");
      }

      return this;
   }

   public void z() {
      qr $$0 = this.b("display");
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
      qr $$0 = this.b("display");
      return $$0 != null && $$0.b("Name", 8);
   }

   public List<sw> a(@Nullable byo $$0, chq $$1) {
      List<sw> $$2 = Lists.newArrayList();
      tj $$3 = sw.h().b(this.y()).a(this.C().e);
      if (this.A()) {
         $$3.a(n.u);
      }

      $$2.add($$3);
      if (!$$1.a() && !this.A() && this.a(cgc.rf)) {
         Integer $$4 = cgg.d(this);
         if ($$4 != null) {
            $$2.add(sw.b("#" + $$4).a(n.h));
         }
      }

      int $$5 = this.P();
      if (a($$5, cfz.a.f)) {
         this.d().a(this, $$0 == null ? null : $$0.dI(), $$2, $$1);
      }

      if (this.u()) {
         if (a($$5, cfz.a.h) && $$0 != null) {
            cib.a(this, $$0.dI().B_(), $$2);
         }

         if (a($$5, cfz.a.a)) {
            a($$2, this.x());
         }

         if (this.v.b("display", 10)) {
            qr $$6 = this.v.p("display");
            if (a($$5, cfz.a.g) && $$6.b("color", 99)) {
               if ($$1.a()) {
                  $$2.add(sw.a("item.color", String.format(Locale.ROOT, "#%06X", $$6.h("color"))).a(n.h));
               } else {
                  $$2.add(sw.c("item.dyed").a(n.h, n.u));
               }
            }

            if ($$6.d("Lore") == 9) {
               qx $$7 = $$6.c("Lore", 8);

               for (int $$8 = 0; $$8 < $$7.size(); $$8++) {
                  String $$9 = $$7.j($$8);

                  try {
                     tj $$10 = sw.a.a($$9);
                     if ($$10 != null) {
                        $$2.add(sy.a($$10, r));
                     }
                  } catch (Exception var19) {
                     $$6.r("Lore");
                  }
               }
            }
         }
      }

      if (a($$5, cfz.a.b)) {
         for (bfo $$12 : bfo.values()) {
            Multimap<bhb, bhe> $$13 = this.a($$12);
            if (!$$13.isEmpty()) {
               $$2.add(sv.a);
               $$2.add(sw.c("item.modifiers." + $$12.d()).a(n.h));

               for (Entry<bhb, bhe> $$14 : $$13.entries()) {
                  bhe $$15 = $$14.getValue();
                  double $$16 = $$15.d();
                  boolean $$17 = false;
                  if ($$0 != null) {
                     if ($$15.a() == cfu.m) {
                        $$16 += $$0.c(bhg.f);
                        $$16 += (double)cki.a(this, bge.a);
                        $$17 = true;
                     } else if ($$15.a() == cfu.n) {
                        $$16 += $$0.c(bhg.h);
                        $$17 = true;
                     }
                  }

                  double $$18;
                  if ($$15.c() == bhe.a.b || $$15.c() == bhe.a.c) {
                     $$18 = $$16 * 100.0;
                  } else if ($$14.getKey().equals(bhg.c)) {
                     $$18 = $$16 * 10.0;
                  } else {
                     $$18 = $$16;
                  }

                  if ($$17) {
                     $$2.add(sv.a().b(sw.a("attribute.modifier.equals." + $$15.c().a(), c.format($$18), sw.c($$14.getKey().c()))).a(n.c));
                  } else if ($$16 > 0.0) {
                     $$2.add(sw.a("attribute.modifier.plus." + $$15.c().a(), c.format($$18), sw.c($$14.getKey().c())).a(n.j));
                  } else if ($$16 < 0.0) {
                     $$18 *= -1.0;
                     $$2.add(sw.a("attribute.modifier.take." + $$15.c().a(), c.format($$18), sw.c($$14.getKey().c())).a(n.m));
                  }
               }
            }
         }
      }

      if (this.u()) {
         if (a($$5, cfz.a.c) && this.v.q("Unbreakable")) {
            $$2.add(sw.c("item.unbreakable").a(n.j));
         }

         if (a($$5, cfz.a.d) && this.v.b("CanDestroy", 9)) {
            qx $$21 = this.v.c("CanDestroy", 8);
            if (!$$21.isEmpty()) {
               $$2.add(sv.a);
               $$2.add(sw.c("item.canBreak").a(n.h));

               for (int $$22 = 0; $$22 < $$21.size(); $$22++) {
                  $$2.addAll(d($$21.j($$22)));
               }
            }
         }

         if (a($$5, cfz.a.e) && this.v.b("CanPlaceOn", 9)) {
            qx $$23 = this.v.c("CanPlaceOn", 8);
            if (!$$23.isEmpty()) {
               $$2.add(sv.a);
               $$2.add(sw.c("item.canPlace").a(n.h));

               for (int $$24 = 0; $$24 < $$23.size(); $$24++) {
                  $$2.addAll(d($$23.j($$24)));
               }
            }
         }
      }

      if ($$1.a()) {
         if (this.j()) {
            $$2.add(sw.a("item.durability", this.l() - this.k(), this.l()));
         }

         $$2.add(sw.b(jb.i.b(this.d()).toString()).a(n.i));
         if (this.u()) {
            $$2.add(sw.a("item.nbt_tags", this.v.e().size()).a(n.i));
         }
      }

      if ($$0 != null && !this.d().a($$0.dI().G())) {
         $$2.add(p);
      }

      return $$2;
   }

   private static boolean a(int $$0, cfz.a $$1) {
      return ($$0 & $$1.a()) == 0;
   }

   private int P() {
      return this.u() && this.v.b("HideFlags", 99) ? this.v.h("HideFlags") : 0;
   }

   public void a(cfz.a $$0) {
      qr $$1 = this.w();
      $$1.a("HideFlags", $$1.h("HideFlags") | $$0.a());
   }

   public static void a(List<sw> $$0, qx $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         qr $$3 = $$1.a($$2);
         jb.g.b(cki.b($$3)).ifPresent($$2x -> $$0.add($$2x.d(cki.a($$3))));
      }
   }

   private static Collection<sw> d(String $$0) {
      try {
         return (Collection<sw>)fg.b(jb.f.p(), $$0, true)
            .map(
               $$0x -> Lists.newArrayList(new sw[]{$$0x.a().b().e().a(n.i)}),
               $$0x -> $$0x.a().a().map($$0xx -> ((cpn)$$0xx.a()).e().a(n.i)).collect(Collectors.toList())
            );
      } catch (CommandSyntaxException var2) {
         return Lists.newArrayList(new sw[]{sw.b("missingno").a(n.i)});
      }
   }

   public boolean B() {
      return this.d().i(this);
   }

   public cgq C() {
      return this.d().n(this);
   }

   public boolean D() {
      return !this.d().d_(this) ? false : !this.E();
   }

   public void a(ckg $$0, int $$1) {
      this.w();
      if (!this.v.b("Enchantments", 9)) {
         this.v.a("Enchantments", new qx());
      }

      qx $$2 = this.v.c("Enchantments", 10);
      $$2.add(cki.a(cki.a($$0), (byte)$$1));
   }

   public boolean E() {
      return this.v != null && this.v.b("Enchantments", 9) ? !this.v.c("Enchantments", 10).isEmpty() : false;
   }

   public void a(String $$0, rk $$1) {
      this.w().a($$0, $$1);
   }

   public boolean F() {
      return this.w instanceof bva;
   }

   public void a(@Nullable bfj $$0) {
      this.w = $$0;
   }

   @Nullable
   public bva G() {
      return this.w instanceof bva ? (bva)this.H() : null;
   }

   @Nullable
   public bfj H() {
      return !this.b() ? this.w : null;
   }

   public int I() {
      return this.u() && this.v.b("RepairCost", 3) ? this.v.h("RepairCost") : 0;
   }

   public void d(int $$0) {
      this.w().a("RepairCost", $$0);
   }

   public Multimap<bhb, bhe> a(bfo $$0) {
      Multimap<bhb, bhe> $$1;
      if (this.u() && this.v.b("AttributeModifiers", 9)) {
         $$1 = HashMultimap.create();
         qx $$2 = this.v.c("AttributeModifiers", 10);

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            qr $$4 = $$2.a($$3);
            if (!$$4.b("Slot", 8) || $$4.l("Slot").equals($$0.d())) {
               Optional<bhb> $$5 = jb.v.b(acq.a($$4.l("AttributeName")));
               if ($$5.isPresent()) {
                  bhe $$6 = bhe.a($$4);
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

   public void a(bhb $$0, bhe $$1, @Nullable bfo $$2) {
      this.w();
      if (!this.v.b("AttributeModifiers", 9)) {
         this.v.a("AttributeModifiers", new qx());
      }

      qx $$3 = this.v.c("AttributeModifiers", 10);
      qr $$4 = $$1.e();
      $$4.a("AttributeName", jb.v.b($$0).toString());
      if ($$2 != null) {
         $$4.a("Slot", $$2.d());
      }

      $$3.add($$4);
   }

   public sw J() {
      tj $$0 = sw.h().b(this.y());
      if (this.A()) {
         $$0.a(n.u);
      }

      tj $$1 = sy.a((sw)$$0);
      if (!this.b()) {
         $$1.a(this.C().e).a($$0x -> $$0x.a(new tb(tb.a.b, new tb.c(this))));
      }

      return $$1;
   }

   public boolean a(hr<cpn> $$0, dcf $$1) {
      if (this.y == null) {
         this.y = new cdh("CanPlaceOn");
      }

      return this.y.a(this, $$0, $$1);
   }

   public boolean b(hr<cpn> $$0, dcf $$1) {
      if (this.x == null) {
         this.x = new cdh("CanDestroy");
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

   public void b(cmm $$0, bfz $$1, int $$2) {
      this.d().a($$0, $$1, this, $$2);
   }

   public void a(bvh $$0) {
      this.d().a($$0);
   }

   public boolean M() {
      return this.d().u();
   }

   public amg N() {
      return this.d().af_();
   }

   public amg O() {
      return this.d().ag_();
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
