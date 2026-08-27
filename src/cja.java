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

public final class cja {
   public static final Codec<cja> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jd.i.q().fieldOf("id").forGetter(cja::d),
               Codec.INT.fieldOf("Count").forGetter(cja::L),
               qu.a.optionalFieldOf("tag").forGetter($$0x -> Optional.ofNullable($$0x.v()))
            )
            .apply($$0, cja::new)
   );
   private static final Logger j = LogUtils.getLogger();
   public static final cja b = new cja((Void)null);
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
   private static final ti p = ti.c("item.disabled").a(n.m);
   private static final int q = 0;
   private static final ue r = ue.a.a(n.f).b(true);
   private int s;
   private int t;
   @Deprecated
   @Nullable
   private final civ u;
   @Nullable
   private qu v;
   @Nullable
   private bil w;
   @Nullable
   private cgi x;
   @Nullable
   private cgi y;

   public Optional<cgg> a() {
      return this.d().h(this);
   }

   public cja(cpp $$0) {
      this($$0, 1);
   }

   public cja(hg<civ> $$0) {
      this($$0.a(), 1);
   }

   private cja(cpp $$0, int $$1, Optional<qu> $$2) {
      this($$0, $$1);
      $$2.ifPresent(this::c);
   }

   public cja(hg<civ> $$0, int $$1) {
      this($$0.a(), $$1);
   }

   public cja(cpp $$0, int $$1) {
      this.u = $$0.k();
      this.s = $$1;
      if (this.u.o()) {
         this.b(this.k());
      }
   }

   private cja(@Nullable Void $$0) {
      this.u = null;
   }

   private cja(qu $$0) {
      this.u = jd.i.a(new aeu($$0.l("id")));
      this.s = $$0.f("Count");
      if ($$0.b("tag", 10)) {
         this.v = $$0.p("tag");
         this.d().b(this.v);
      }

      if (this.d().o()) {
         this.b(this.k());
      }
   }

   public static cja a(qu $$0) {
      try {
         return new cja($$0);
      } catch (RuntimeException var2) {
         j.debug("Tried to load invalid item: {}", $$0, var2);
         return b;
      }
   }

   public boolean b() {
      return this == b || this.u == cjd.a || this.s <= 0;
   }

   public boolean a(cdx $$0) {
      return this.b() || this.d().a($$0);
   }

   public cja a(int $$0) {
      int $$1 = Math.min($$0, this.L());
      cja $$2 = this.c($$1);
      this.h($$1);
      return $$2;
   }

   public cja c() {
      if (this.b()) {
         return b;
      } else {
         cja $$0 = this.p();
         this.f(0);
         return $$0;
      }
   }

   public civ d() {
      return this.b() ? cjd.a : this.u;
   }

   public hg<civ> e() {
      return this.d().j();
   }

   public boolean a(aqd<civ> $$0) {
      return this.d().j().a($$0);
   }

   public boolean a(civ $$0) {
      return this.d() == $$0;
   }

   public boolean a(Predicate<hg<civ>> $$0) {
      return $$0.test(this.d().j());
   }

   public boolean a(hg<civ> $$0) {
      return this.d().j() == $$0;
   }

   public boolean a(hk<civ> $$0) {
      return $$0.a(this.e());
   }

   public Stream<aqd<civ>> f() {
      return this.d().j().c();
   }

   public bgt a(clk $$0) {
      cbp $$1 = $$0.o();
      gw $$2 = $$0.a();
      dfi $$3 = new dfi($$0.q(), $$2, false);
      if ($$1 != null && !$$1.fR().e && !this.a($$0.q().B_().d(je.e), $$3)) {
         return bgt.d;
      } else {
         civ $$4 = this.d();
         bgt $$5 = $$4.a($$0);
         if ($$1 != null && $$5.c()) {
            $$1.b(apj.c.b($$4));
         }

         return $$5;
      }
   }

   public float a(dfe $$0) {
      return this.d().a(this, $$0);
   }

   public bgu<cja> a(cpq $$0, cbp $$1, bgs $$2) {
      return this.d().a($$0, $$1, $$2);
   }

   public cja a(cpq $$0, bjb $$1) {
      return this.d().a(this, $$0, $$1);
   }

   public qu b(qu $$0) {
      aeu $$1 = jd.i.b(this.d());
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
         qu $$0 = this.v();
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

   public boolean a(int $$0, arx $$1, @Nullable ako $$2) {
      if (!this.i()) {
         return false;
      } else {
         if ($$0 > 0) {
            int $$3 = cnl.a(cnn.w, this);
            int $$4 = 0;

            for (int $$5 = 0; $$3 > 0 && $$5 < $$0; $$5++) {
               if (cnh.a(this, $$3, $$1)) {
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

   public <T extends bjb> void a(int $$0, T $$1, Consumer<T> $$2) {
      if (!$$1.dK().B && (!($$1 instanceof cbp) || !((cbp)$$1).fR().d)) {
         if (this.i()) {
            if (this.a($$0, $$1.ee(), $$1 instanceof ako ? (ako)$$1 : null)) {
               $$2.accept($$1);
               civ $$3 = this.d();
               this.h(1);
               if ($$1 instanceof cbp) {
                  ((cbp)$$1).b(apj.d.b($$3));
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

   public boolean a(cfy $$0, ceo $$1, cbp $$2) {
      return this.d().a(this, $$0, $$1, $$2);
   }

   public boolean a(cja $$0, cfy $$1, ceo $$2, cbp $$3, bjt $$4) {
      return this.d().a(this, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(bjb $$0, cbp $$1) {
      civ $$2 = this.d();
      if ($$2.a(this, $$0, $$1)) {
         $$1.b(apj.c.b($$2));
      }
   }

   public void a(cpq $$0, dfe $$1, gw $$2, cbp $$3) {
      civ $$4 = this.d();
      if ($$4.a(this, $$0, $$1, $$2, $$3)) {
         $$3.b(apj.c.b($$4));
      }
   }

   public boolean b(dfe $$0) {
      return this.d().a_($$0);
   }

   public bgt a(cbp $$0, bjb $$1, bgs $$2) {
      return this.d().a(this, $$0, $$1, $$2);
   }

   public cja p() {
      if (this.b()) {
         return b;
      } else {
         cja $$0 = new cja(this.d(), this.s);
         $$0.e(this.K());
         if (this.v != null) {
            $$0.v = this.v.h();
         }

         return $$0;
      }
   }

   public cja c(int $$0) {
      if (this.b()) {
         return b;
      } else {
         cja $$1 = this.p();
         $$1.f($$0);
         return $$1;
      }
   }

   public static boolean a(cja $$0, cja $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return $$0.L() != $$1.L() ? false : c($$0, $$1);
      }
   }

   public static boolean b(cja $$0, cja $$1) {
      return $$0.a($$1.d());
   }

   public static boolean c(cja $$0, cja $$1) {
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

   public void a(cpq $$0, bil $$1, int $$2, boolean $$3) {
      if (this.t > 0) {
         this.t--;
      }

      if (this.d() != null) {
         this.d().a(this, $$0, $$1, $$2, $$3);
      }
   }

   public void a(cpq $$0, cbp $$1, int $$2) {
      $$1.a(apj.b.b(this.d()), $$2);
      this.d().b(this, $$0, $$1);
   }

   public int r() {
      return this.d().b(this);
   }

   public ckt s() {
      return this.d().c(this);
   }

   public void a(cpq $$0, bjb $$1, int $$2) {
      this.d().a(this, $$0, $$1, $$2);
   }

   public boolean t() {
      return this.d().l(this);
   }

   public boolean u() {
      return !this.b() && this.v != null && !this.v.g();
   }

   @Nullable
   public qu v() {
      return this.v;
   }

   public qu w() {
      if (this.v == null) {
         this.c(new qu());
      }

      return this.v;
   }

   public qu a(String $$0) {
      if (this.v != null && this.v.b($$0, 10)) {
         return this.v.p($$0);
      } else {
         qu $$1 = new qu();
         this.a($$0, $$1);
         return $$1;
      }
   }

   @Nullable
   public qu b(String $$0) {
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

   public ra x() {
      return this.v != null ? this.v.c("Enchantments", 10) : new ra();
   }

   public void c(@Nullable qu $$0) {
      this.v = $$0;
      if (this.d().o()) {
         this.b(this.k());
      }

      if ($$0 != null) {
         this.d().b($$0);
      }
   }

   public ti y() {
      qu $$0 = this.b("display");
      if ($$0 != null && $$0.b("Name", 8)) {
         try {
            ti $$1 = ti.a.a($$0.l("Name"));
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

   public cja a(@Nullable ti $$0) {
      qu $$1 = this.a("display");
      if ($$0 != null) {
         $$1.a("Name", ti.a.a($$0));
      } else {
         $$1.r("Name");
      }

      return this;
   }

   public void z() {
      qu $$0 = this.b("display");
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
      qu $$0 = this.b("display");
      return $$0 != null && $$0.b("Name", 8);
   }

   public List<ti> a(@Nullable cbp $$0, ckr $$1) {
      List<ti> $$2 = Lists.newArrayList();
      tv $$3 = ti.h().b(this.y()).a(this.C().e);
      if (this.A()) {
         $$3.a(n.u);
      }

      $$2.add($$3);
      if (!$$1.a() && !this.A() && this.a(cjd.rf)) {
         Integer $$4 = cjh.d(this);
         if ($$4 != null) {
            $$2.add(ti.b("#" + $$4).a(n.h));
         }
      }

      int $$5 = this.P();
      if (a($$5, cja.a.f)) {
         this.d().a(this, $$0 == null ? null : $$0.dK(), $$2, $$1);
      }

      if (this.u()) {
         if (a($$5, cja.a.h) && $$0 != null) {
            clc.a(this, $$0.dK().B_(), $$2);
         }

         if (a($$5, cja.a.a)) {
            a($$2, this.x());
         }

         if (this.v.b("display", 10)) {
            qu $$6 = this.v.p("display");
            if (a($$5, cja.a.g) && $$6.b("color", 99)) {
               if ($$1.a()) {
                  $$2.add(ti.a("item.color", String.format(Locale.ROOT, "#%06X", $$6.h("color"))).a(n.h));
               } else {
                  $$2.add(ti.c("item.dyed").a(n.h, n.u));
               }
            }

            if ($$6.d("Lore") == 9) {
               ra $$7 = $$6.c("Lore", 8);

               for (int $$8 = 0; $$8 < $$7.size(); $$8++) {
                  String $$9 = $$7.j($$8);

                  try {
                     tv $$10 = ti.a.a($$9);
                     if ($$10 != null) {
                        $$2.add(tk.a($$10, r));
                     }
                  } catch (Exception var19) {
                     $$6.r("Lore");
                  }
               }
            }
         }
      }

      if (a($$5, cja.a.b)) {
         for (biq $$12 : biq.values()) {
            Multimap<bkc, bkf> $$13 = this.a($$12);
            if (!$$13.isEmpty()) {
               $$2.add(th.a);
               $$2.add(ti.c("item.modifiers." + $$12.e()).a(n.h));

               for (Entry<bkc, bkf> $$14 : $$13.entries()) {
                  bkf $$15 = $$14.getValue();
                  double $$16 = $$15.d();
                  boolean $$17 = false;
                  if ($$0 != null) {
                     if ($$15.a() == civ.m) {
                        $$16 += $$0.c(bkh.f);
                        $$16 += (double)cnl.a(this, bjg.a);
                        $$17 = true;
                     } else if ($$15.a() == civ.n) {
                        $$16 += $$0.c(bkh.h);
                        $$17 = true;
                     }
                  }

                  double $$18;
                  if ($$15.c() == bkf.a.b || $$15.c() == bkf.a.c) {
                     $$18 = $$16 * 100.0;
                  } else if ($$14.getKey().equals(bkh.c)) {
                     $$18 = $$16 * 10.0;
                  } else {
                     $$18 = $$16;
                  }

                  if ($$17) {
                     $$2.add(th.a().b(ti.a("attribute.modifier.equals." + $$15.c().a(), c.format($$18), ti.c($$14.getKey().c()))).a(n.c));
                  } else if ($$16 > 0.0) {
                     $$2.add(ti.a("attribute.modifier.plus." + $$15.c().a(), c.format($$18), ti.c($$14.getKey().c())).a(n.j));
                  } else if ($$16 < 0.0) {
                     $$18 *= -1.0;
                     $$2.add(ti.a("attribute.modifier.take." + $$15.c().a(), c.format($$18), ti.c($$14.getKey().c())).a(n.m));
                  }
               }
            }
         }
      }

      if (this.u()) {
         if (a($$5, cja.a.c) && this.v.q("Unbreakable")) {
            $$2.add(ti.c("item.unbreakable").a(n.j));
         }

         if (a($$5, cja.a.d) && this.v.b("CanDestroy", 9)) {
            ra $$21 = this.v.c("CanDestroy", 8);
            if (!$$21.isEmpty()) {
               $$2.add(th.a);
               $$2.add(ti.c("item.canBreak").a(n.h));

               for (int $$22 = 0; $$22 < $$21.size(); $$22++) {
                  $$2.addAll(d($$21.j($$22)));
               }
            }
         }

         if (a($$5, cja.a.e) && this.v.b("CanPlaceOn", 9)) {
            ra $$23 = this.v.c("CanPlaceOn", 8);
            if (!$$23.isEmpty()) {
               $$2.add(th.a);
               $$2.add(ti.c("item.canPlace").a(n.h));

               for (int $$24 = 0; $$24 < $$23.size(); $$24++) {
                  $$2.addAll(d($$23.j($$24)));
               }
            }
         }
      }

      if ($$1.a()) {
         if (this.j()) {
            $$2.add(ti.a("item.durability", this.l() - this.k(), this.l()));
         }

         $$2.add(ti.b(jd.i.b(this.d()).toString()).a(n.i));
         if (this.u()) {
            $$2.add(ti.a("item.nbt_tags", this.v.e().size()).a(n.i));
         }
      }

      if ($$0 != null && !this.d().a($$0.dK().G())) {
         $$2.add(p);
      }

      return $$2;
   }

   private static boolean a(int $$0, cja.a $$1) {
      return ($$0 & $$1.a()) == 0;
   }

   private int P() {
      return this.u() && this.v.b("HideFlags", 99) ? this.v.h("HideFlags") : 0;
   }

   public void a(cja.a $$0) {
      qu $$1 = this.w();
      $$1.a("HideFlags", $$1.h("HideFlags") | $$0.a());
   }

   public static void a(List<ti> $$0, ra $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         qu $$3 = $$1.a($$2);
         jd.g.b(cnl.b($$3)).ifPresent($$2x -> $$0.add($$2x.d(cnl.a($$3))));
      }
   }

   private static Collection<ti> d(String $$0) {
      try {
         return (Collection<ti>)fi.b(jd.f.p(), $$0, true)
            .map(
               $$0x -> Lists.newArrayList(new ti[]{$$0x.a().b().e().a(n.i)}),
               $$0x -> $$0x.a().a().map($$0xx -> ((csq)$$0xx.a()).e().a(n.i)).collect(Collectors.toList())
            );
      } catch (CommandSyntaxException var2) {
         return Lists.newArrayList(new ti[]{ti.b("missingno").a(n.i)});
      }
   }

   public boolean B() {
      return this.d().i(this);
   }

   public cjr C() {
      return this.d().n(this);
   }

   public boolean D() {
      return !this.d().d_(this) ? false : !this.E();
   }

   public void a(cnj $$0, int $$1) {
      this.w();
      if (!this.v.b("Enchantments", 9)) {
         this.v.a("Enchantments", new ra());
      }

      ra $$2 = this.v.c("Enchantments", 10);
      $$2.add(cnl.a(cnl.a($$0), (byte)$$1));
   }

   public boolean E() {
      return this.v != null && this.v.b("Enchantments", 9) ? !this.v.c("Enchantments", 10).isEmpty() : false;
   }

   public void a(String $$0, rn $$1) {
      this.w().a($$0, $$1);
   }

   public boolean F() {
      return this.w instanceof byb;
   }

   public void a(@Nullable bil $$0) {
      this.w = $$0;
   }

   @Nullable
   public byb G() {
      return this.w instanceof byb ? (byb)this.H() : null;
   }

   @Nullable
   public bil H() {
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

   public Multimap<bkc, bkf> a(biq $$0) {
      Multimap<bkc, bkf> $$1;
      if (this.u() && this.v.b("AttributeModifiers", 9)) {
         $$1 = HashMultimap.create();
         ra $$2 = this.v.c("AttributeModifiers", 10);

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            qu $$4 = $$2.a($$3);
            if (!$$4.b("Slot", 8) || $$4.l("Slot").equals($$0.e())) {
               Optional<bkc> $$5 = jd.v.b(aeu.a($$4.l("AttributeName")));
               if (!$$5.isEmpty()) {
                  bkf $$6 = bkf.a($$4);
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

   public void a(bkc $$0, bkf $$1, @Nullable biq $$2) {
      this.w();
      if (!this.v.b("AttributeModifiers", 9)) {
         this.v.a("AttributeModifiers", new ra());
      }

      ra $$3 = this.v.c("AttributeModifiers", 10);
      qu $$4 = $$1.e();
      $$4.a("AttributeName", jd.v.b($$0).toString());
      if ($$2 != null) {
         $$4.a("Slot", $$2.e());
      }

      $$3.add($$4);
   }

   public ti J() {
      tv $$0 = ti.h().b(this.y());
      if (this.A()) {
         $$0.a(n.u);
      }

      tv $$1 = tk.a((ti)$$0);
      if (!this.b()) {
         $$1.a(this.C().e).a($$0x -> $$0x.a(new tn(tn.a.b, new tn.c(this))));
      }

      return $$1;
   }

   public boolean a(ht<csq> $$0, dfi $$1) {
      if (this.y == null) {
         this.y = new cgi("CanPlaceOn");
      }

      return this.y.a(this, $$0, $$1);
   }

   public boolean b(ht<csq> $$0, dfi $$1) {
      if (this.x == null) {
         this.x = new cgi("CanDestroy");
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

   public void b(cpq $$0, bjb $$1, int $$2) {
      this.d().a($$0, $$1, this, $$2);
   }

   public void a(byi $$0) {
      this.d().a($$0);
   }

   public boolean M() {
      return this.d().u();
   }

   public aoy N() {
      return this.d().ae_();
   }

   public aoy O() {
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
