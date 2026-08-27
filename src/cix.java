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

public final class cix {
   public static final Codec<cix> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jb.i.q().fieldOf("id").forGetter(cix::d),
               Codec.INT.fieldOf("Count").forGetter(cix::L),
               qr.a.optionalFieldOf("tag").forGetter($$0x -> Optional.ofNullable($$0x.v()))
            )
            .apply($$0, cix::new)
   );
   private static final Logger j = LogUtils.getLogger();
   public static final cix b = new cix((Void)null);
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
   private static final tf p = tf.c("item.disabled").a(n.m);
   private static final int q = 0;
   private static final ub r = ub.a.a(n.f).b(true);
   private int s;
   private int t;
   @Deprecated
   @Nullable
   private final cis u;
   @Nullable
   private qr v;
   @Nullable
   private bii w;
   @Nullable
   private cgf x;
   @Nullable
   private cgf y;

   public Optional<cgd> a() {
      return this.d().h(this);
   }

   public cix(cpk $$0) {
      this($$0, 1);
   }

   public cix(he<cis> $$0) {
      this($$0.a(), 1);
   }

   private cix(cpk $$0, int $$1, Optional<qr> $$2) {
      this($$0, $$1);
      $$2.ifPresent(this::c);
   }

   public cix(he<cis> $$0, int $$1) {
      this($$0.a(), $$1);
   }

   public cix(cpk $$0, int $$1) {
      this.u = $$0.k();
      this.s = $$1;
      if (this.u.o()) {
         this.b(this.k());
      }
   }

   private cix(@Nullable Void $$0) {
      this.u = null;
   }

   private cix(qr $$0) {
      this.u = jb.i.a(new aer($$0.l("id")));
      this.s = $$0.f("Count");
      if ($$0.b("tag", 10)) {
         this.v = $$0.p("tag");
         this.d().b(this.v);
      }

      if (this.d().o()) {
         this.b(this.k());
      }
   }

   public static cix a(qr $$0) {
      try {
         return new cix($$0);
      } catch (RuntimeException var2) {
         j.debug("Tried to load invalid item: {}", $$0, var2);
         return b;
      }
   }

   public boolean b() {
      return this == b || this.u == cja.a || this.s <= 0;
   }

   public boolean a(cdu $$0) {
      return this.b() || this.d().a($$0);
   }

   public cix a(int $$0) {
      int $$1 = Math.min($$0, this.L());
      cix $$2 = this.c($$1);
      this.h($$1);
      return $$2;
   }

   public cix c() {
      if (this.b()) {
         return b;
      } else {
         cix $$0 = this.p();
         this.f(0);
         return $$0;
      }
   }

   public cis d() {
      return this.b() ? cja.a : this.u;
   }

   public he<cis> e() {
      return this.d().j();
   }

   public boolean a(aqa<cis> $$0) {
      return this.d().j().a($$0);
   }

   public boolean a(cis $$0) {
      return this.d() == $$0;
   }

   public boolean a(Predicate<he<cis>> $$0) {
      return $$0.test(this.d().j());
   }

   public boolean a(he<cis> $$0) {
      return this.d().j() == $$0;
   }

   public boolean a(hi<cis> $$0) {
      return $$0.a(this.e());
   }

   public Stream<aqa<cis>> f() {
      return this.d().j().c();
   }

   public bgq a(clh $$0) {
      cbm $$1 = $$0.o();
      gu $$2 = $$0.a();
      dfd $$3 = new dfd($$0.q(), $$2, false);
      if ($$1 != null && !$$1.fR().e && !this.a($$0.q().B_().d(jc.e), $$3)) {
         return bgq.d;
      } else {
         cis $$4 = this.d();
         bgq $$5 = $$4.a($$0);
         if ($$1 != null && $$5.c()) {
            $$1.b(apg.c.b($$4));
         }

         return $$5;
      }
   }

   public float a(dez $$0) {
      return this.d().a(this, $$0);
   }

   public bgr<cix> a(cpl $$0, cbm $$1, bgp $$2) {
      return this.d().a($$0, $$1, $$2);
   }

   public cix a(cpl $$0, biy $$1) {
      return this.d().a(this, $$0, $$1);
   }

   public qr b(qr $$0) {
      aer $$1 = jb.i.b(this.d());
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

   public boolean a(int $$0, aru $$1, @Nullable akl $$2) {
      if (!this.i()) {
         return false;
      } else {
         if ($$0 > 0) {
            int $$3 = cng.a(cni.w, this);
            int $$4 = 0;

            for (int $$5 = 0; $$3 > 0 && $$5 < $$0; $$5++) {
               if (cnc.a(this, $$3, $$1)) {
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

   public <T extends biy> void a(int $$0, T $$1, Consumer<T> $$2) {
      if (!$$1.dK().B && (!($$1 instanceof cbm) || !((cbm)$$1).fR().d)) {
         if (this.i()) {
            if (this.a($$0, $$1.ee(), $$1 instanceof akl ? (akl)$$1 : null)) {
               $$2.accept($$1);
               cis $$3 = this.d();
               this.h(1);
               if ($$1 instanceof cbm) {
                  ((cbm)$$1).b(apg.d.b($$3));
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

   public boolean a(cfv $$0, cel $$1, cbm $$2) {
      return this.d().a(this, $$0, $$1, $$2);
   }

   public boolean a(cix $$0, cfv $$1, cel $$2, cbm $$3, bjq $$4) {
      return this.d().a(this, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(biy $$0, cbm $$1) {
      cis $$2 = this.d();
      if ($$2.a(this, $$0, $$1)) {
         $$1.b(apg.c.b($$2));
      }
   }

   public void a(cpl $$0, dez $$1, gu $$2, cbm $$3) {
      cis $$4 = this.d();
      if ($$4.a(this, $$0, $$1, $$2, $$3)) {
         $$3.b(apg.c.b($$4));
      }
   }

   public boolean b(dez $$0) {
      return this.d().a_($$0);
   }

   public bgq a(cbm $$0, biy $$1, bgp $$2) {
      return this.d().a(this, $$0, $$1, $$2);
   }

   public cix p() {
      if (this.b()) {
         return b;
      } else {
         cix $$0 = new cix(this.d(), this.s);
         $$0.e(this.K());
         if (this.v != null) {
            $$0.v = this.v.h();
         }

         return $$0;
      }
   }

   public cix c(int $$0) {
      if (this.b()) {
         return b;
      } else {
         cix $$1 = this.p();
         $$1.f($$0);
         return $$1;
      }
   }

   public static boolean a(cix $$0, cix $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return $$0.L() != $$1.L() ? false : c($$0, $$1);
      }
   }

   public static boolean b(cix $$0, cix $$1) {
      return $$0.a($$1.d());
   }

   public static boolean c(cix $$0, cix $$1) {
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

   public void a(cpl $$0, bii $$1, int $$2, boolean $$3) {
      if (this.t > 0) {
         this.t--;
      }

      if (this.d() != null) {
         this.d().a(this, $$0, $$1, $$2, $$3);
      }
   }

   public void a(cpl $$0, cbm $$1, int $$2) {
      $$1.a(apg.b.b(this.d()), $$2);
      this.d().b(this, $$0, $$1);
   }

   public int r() {
      return this.d().b(this);
   }

   public ckq s() {
      return this.d().c(this);
   }

   public void a(cpl $$0, biy $$1, int $$2) {
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

   public tf y() {
      qr $$0 = this.b("display");
      if ($$0 != null && $$0.b("Name", 8)) {
         try {
            tf $$1 = tf.a.a($$0.l("Name"));
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

   public cix a(@Nullable tf $$0) {
      qr $$1 = this.a("display");
      if ($$0 != null) {
         $$1.a("Name", tf.a.a($$0));
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

   public List<tf> a(@Nullable cbm $$0, cko $$1) {
      List<tf> $$2 = Lists.newArrayList();
      ts $$3 = tf.h().b(this.y()).a(this.C().e);
      if (this.A()) {
         $$3.a(n.u);
      }

      $$2.add($$3);
      if (!$$1.a() && !this.A() && this.a(cja.rf)) {
         Integer $$4 = cje.d(this);
         if ($$4 != null) {
            $$2.add(tf.b("#" + $$4).a(n.h));
         }
      }

      int $$5 = this.P();
      if (a($$5, cix.a.f)) {
         this.d().a(this, $$0 == null ? null : $$0.dK(), $$2, $$1);
      }

      if (this.u()) {
         if (a($$5, cix.a.h) && $$0 != null) {
            ckz.a(this, $$0.dK().B_(), $$2);
         }

         if (a($$5, cix.a.a)) {
            a($$2, this.x());
         }

         if (this.v.b("display", 10)) {
            qr $$6 = this.v.p("display");
            if (a($$5, cix.a.g) && $$6.b("color", 99)) {
               if ($$1.a()) {
                  $$2.add(tf.a("item.color", String.format(Locale.ROOT, "#%06X", $$6.h("color"))).a(n.h));
               } else {
                  $$2.add(tf.c("item.dyed").a(n.h, n.u));
               }
            }

            if ($$6.d("Lore") == 9) {
               qx $$7 = $$6.c("Lore", 8);

               for (int $$8 = 0; $$8 < $$7.size(); $$8++) {
                  String $$9 = $$7.j($$8);

                  try {
                     ts $$10 = tf.a.a($$9);
                     if ($$10 != null) {
                        $$2.add(th.a($$10, r));
                     }
                  } catch (Exception var19) {
                     $$6.r("Lore");
                  }
               }
            }
         }
      }

      if (a($$5, cix.a.b)) {
         for (bin $$12 : bin.values()) {
            Multimap<bjz, bkc> $$13 = this.a($$12);
            if (!$$13.isEmpty()) {
               $$2.add(te.a);
               $$2.add(tf.c("item.modifiers." + $$12.e()).a(n.h));

               for (Entry<bjz, bkc> $$14 : $$13.entries()) {
                  bkc $$15 = $$14.getValue();
                  double $$16 = $$15.d();
                  boolean $$17 = false;
                  if ($$0 != null) {
                     if ($$15.a() == cis.m) {
                        $$16 += $$0.c(bke.f);
                        $$16 += (double)cng.a(this, bjd.a);
                        $$17 = true;
                     } else if ($$15.a() == cis.n) {
                        $$16 += $$0.c(bke.h);
                        $$17 = true;
                     }
                  }

                  double $$18;
                  if ($$15.c() == bkc.a.b || $$15.c() == bkc.a.c) {
                     $$18 = $$16 * 100.0;
                  } else if ($$14.getKey().equals(bke.c)) {
                     $$18 = $$16 * 10.0;
                  } else {
                     $$18 = $$16;
                  }

                  if ($$17) {
                     $$2.add(te.a().b(tf.a("attribute.modifier.equals." + $$15.c().a(), c.format($$18), tf.c($$14.getKey().c()))).a(n.c));
                  } else if ($$16 > 0.0) {
                     $$2.add(tf.a("attribute.modifier.plus." + $$15.c().a(), c.format($$18), tf.c($$14.getKey().c())).a(n.j));
                  } else if ($$16 < 0.0) {
                     $$18 *= -1.0;
                     $$2.add(tf.a("attribute.modifier.take." + $$15.c().a(), c.format($$18), tf.c($$14.getKey().c())).a(n.m));
                  }
               }
            }
         }
      }

      if (this.u()) {
         if (a($$5, cix.a.c) && this.v.q("Unbreakable")) {
            $$2.add(tf.c("item.unbreakable").a(n.j));
         }

         if (a($$5, cix.a.d) && this.v.b("CanDestroy", 9)) {
            qx $$21 = this.v.c("CanDestroy", 8);
            if (!$$21.isEmpty()) {
               $$2.add(te.a);
               $$2.add(tf.c("item.canBreak").a(n.h));

               for (int $$22 = 0; $$22 < $$21.size(); $$22++) {
                  $$2.addAll(d($$21.j($$22)));
               }
            }
         }

         if (a($$5, cix.a.e) && this.v.b("CanPlaceOn", 9)) {
            qx $$23 = this.v.c("CanPlaceOn", 8);
            if (!$$23.isEmpty()) {
               $$2.add(te.a);
               $$2.add(tf.c("item.canPlace").a(n.h));

               for (int $$24 = 0; $$24 < $$23.size(); $$24++) {
                  $$2.addAll(d($$23.j($$24)));
               }
            }
         }
      }

      if ($$1.a()) {
         if (this.j()) {
            $$2.add(tf.a("item.durability", this.l() - this.k(), this.l()));
         }

         $$2.add(tf.b(jb.i.b(this.d()).toString()).a(n.i));
         if (this.u()) {
            $$2.add(tf.a("item.nbt_tags", this.v.e().size()).a(n.i));
         }
      }

      if ($$0 != null && !this.d().a($$0.dK().G())) {
         $$2.add(p);
      }

      return $$2;
   }

   private static boolean a(int $$0, cix.a $$1) {
      return ($$0 & $$1.a()) == 0;
   }

   private int P() {
      return this.u() && this.v.b("HideFlags", 99) ? this.v.h("HideFlags") : 0;
   }

   public void a(cix.a $$0) {
      qr $$1 = this.w();
      $$1.a("HideFlags", $$1.h("HideFlags") | $$0.a());
   }

   public static void a(List<tf> $$0, qx $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         qr $$3 = $$1.a($$2);
         jb.g.b(cng.b($$3)).ifPresent($$2x -> $$0.add($$2x.d(cng.a($$3))));
      }
   }

   private static Collection<tf> d(String $$0) {
      try {
         return (Collection<tf>)fg.b(jb.f.p(), $$0, true)
            .map(
               $$0x -> Lists.newArrayList(new tf[]{$$0x.a().b().e().a(n.i)}),
               $$0x -> $$0x.a().a().map($$0xx -> ((csl)$$0xx.a()).e().a(n.i)).collect(Collectors.toList())
            );
      } catch (CommandSyntaxException var2) {
         return Lists.newArrayList(new tf[]{tf.b("missingno").a(n.i)});
      }
   }

   public boolean B() {
      return this.d().i(this);
   }

   public cjo C() {
      return this.d().n(this);
   }

   public boolean D() {
      return !this.d().d_(this) ? false : !this.E();
   }

   public void a(cne $$0, int $$1) {
      this.w();
      if (!this.v.b("Enchantments", 9)) {
         this.v.a("Enchantments", new qx());
      }

      qx $$2 = this.v.c("Enchantments", 10);
      $$2.add(cng.a(cng.a($$0), (byte)$$1));
   }

   public boolean E() {
      return this.v != null && this.v.b("Enchantments", 9) ? !this.v.c("Enchantments", 10).isEmpty() : false;
   }

   public void a(String $$0, rk $$1) {
      this.w().a($$0, $$1);
   }

   public boolean F() {
      return this.w instanceof bxy;
   }

   public void a(@Nullable bii $$0) {
      this.w = $$0;
   }

   @Nullable
   public bxy G() {
      return this.w instanceof bxy ? (bxy)this.H() : null;
   }

   @Nullable
   public bii H() {
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

   public Multimap<bjz, bkc> a(bin $$0) {
      Multimap<bjz, bkc> $$1;
      if (this.u() && this.v.b("AttributeModifiers", 9)) {
         $$1 = HashMultimap.create();
         qx $$2 = this.v.c("AttributeModifiers", 10);

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            qr $$4 = $$2.a($$3);
            if (!$$4.b("Slot", 8) || $$4.l("Slot").equals($$0.e())) {
               Optional<bjz> $$5 = jb.v.b(aer.a($$4.l("AttributeName")));
               if (!$$5.isEmpty()) {
                  bkc $$6 = bkc.a($$4);
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

   public void a(bjz $$0, bkc $$1, @Nullable bin $$2) {
      this.w();
      if (!this.v.b("AttributeModifiers", 9)) {
         this.v.a("AttributeModifiers", new qx());
      }

      qx $$3 = this.v.c("AttributeModifiers", 10);
      qr $$4 = $$1.e();
      $$4.a("AttributeName", jb.v.b($$0).toString());
      if ($$2 != null) {
         $$4.a("Slot", $$2.e());
      }

      $$3.add($$4);
   }

   public tf J() {
      ts $$0 = tf.h().b(this.y());
      if (this.A()) {
         $$0.a(n.u);
      }

      ts $$1 = th.a((tf)$$0);
      if (!this.b()) {
         $$1.a(this.C().e).a($$0x -> $$0x.a(new tk(tk.a.b, new tk.c(this))));
      }

      return $$1;
   }

   public boolean a(hr<csl> $$0, dfd $$1) {
      if (this.y == null) {
         this.y = new cgf("CanPlaceOn");
      }

      return this.y.a(this, $$0, $$1);
   }

   public boolean b(hr<csl> $$0, dfd $$1) {
      if (this.x == null) {
         this.x = new cgf("CanDestroy");
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

   public void b(cpl $$0, biy $$1, int $$2) {
      this.d().a($$0, $$1, this, $$2);
   }

   public void a(byf $$0) {
      this.d().a($$0);
   }

   public boolean M() {
      return this.d().u();
   }

   public aov N() {
      return this.d().ae_();
   }

   public aov O() {
      return this.d().af_();
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
