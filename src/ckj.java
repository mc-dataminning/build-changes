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

public final class ckj {
   public static final Codec<ckj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jy.i.q().fieldOf("id").forGetter(ckj::d),
               Codec.INT.fieldOf("Count").forGetter(ckj::L),
               rt.a.optionalFieldOf("tag").forGetter($$0x -> Optional.ofNullable($$0x.v()))
            )
            .apply($$0, ckj::new)
   );
   private static final Logger j = LogUtils.getLogger();
   public static final ckj b = new ckj((Void)null);
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
   private static final ui p = ui.c("item.disabled").a(n.m);
   private static final int q = 0;
   private static final vf r = vf.a.a(n.f).b(true);
   private int s;
   private int t;
   @Deprecated
   @Nullable
   private final cke u;
   @Nullable
   private rt v;
   @Nullable
   private bjt w;
   @Nullable
   private chr x;
   @Nullable
   private chr y;

   public Optional<chp> a() {
      return this.d().h(this);
   }

   public ckj(cqy $$0) {
      this($$0, 1);
   }

   public ckj(ib<cke> $$0) {
      this($$0.a(), 1);
   }

   private ckj(cqy $$0, int $$1, Optional<rt> $$2) {
      this($$0, $$1);
      $$2.ifPresent(this::c);
   }

   public ckj(ib<cke> $$0, int $$1) {
      this($$0.a(), $$1);
   }

   public ckj(cqy $$0, int $$1) {
      this.u = $$0.k();
      this.s = $$1;
      if (this.u.o()) {
         this.b(this.k());
      }
   }

   private ckj(@Nullable Void $$0) {
      this.u = null;
   }

   private ckj(rt $$0) {
      this.u = jy.i.a(new afw($$0.l("id")));
      this.s = $$0.f("Count");
      if ($$0.b("tag", 10)) {
         this.v = $$0.p("tag");
         this.d().b(this.v);
      }

      if (this.d().o()) {
         this.b(this.k());
      }
   }

   public static ckj a(rt $$0) {
      try {
         return new ckj($$0);
      } catch (RuntimeException var2) {
         j.debug("Tried to load invalid item: {}", $$0, var2);
         return b;
      }
   }

   public boolean b() {
      return this == b || this.u == ckm.a || this.s <= 0;
   }

   public boolean a(cfg $$0) {
      return this.b() || this.d().a($$0);
   }

   public ckj a(int $$0) {
      int $$1 = Math.min($$0, this.L());
      ckj $$2 = this.c($$1);
      this.h($$1);
      return $$2;
   }

   public ckj c() {
      if (this.b()) {
         return b;
      } else {
         ckj $$0 = this.p();
         this.f(0);
         return $$0;
      }
   }

   public cke d() {
      return this.b() ? ckm.a : this.u;
   }

   public ib<cke> e() {
      return this.d().j();
   }

   public boolean a(arh<cke> $$0) {
      return this.d().j().a($$0);
   }

   public boolean a(cke $$0) {
      return this.d() == $$0;
   }

   public boolean a(Predicate<ib<cke>> $$0) {
      return $$0.test(this.d().j());
   }

   public boolean a(ib<cke> $$0) {
      return this.d().j() == $$0;
   }

   public boolean a(ig<cke> $$0) {
      return $$0.a(this.e());
   }

   public Stream<arh<cke>> f() {
      return this.d().j().c();
   }

   public bib a(cmt $$0) {
      ccx $$1 = $$0.o();
      ht $$2 = $$0.a();
      dgf $$3 = new dgf($$0.q(), $$2, false);
      if ($$1 != null && !$$1.fT().e && !this.a($$0.q().H_().d(jz.e), $$3)) {
         return bib.d;
      } else {
         cke $$4 = this.d();
         bib $$5 = $$4.a($$0);
         if ($$1 != null && $$5.c()) {
            $$1.b(aqn.c.b($$4));
         }

         return $$5;
      }
   }

   public float a(dgb $$0) {
      return this.d().a(this, $$0);
   }

   public bic<ckj> a(cqz $$0, ccx $$1, bia $$2) {
      return this.d().a($$0, $$1, $$2);
   }

   public ckj a(cqz $$0, bkj $$1) {
      return this.d().a(this, $$0, $$1);
   }

   public rt b(rt $$0) {
      afw $$1 = jy.i.b(this.d());
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
         rt $$0 = this.v();
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

   public boolean a(int $$0, ate $$1, @Nullable alr $$2) {
      if (!this.i()) {
         return false;
      } else {
         if ($$0 > 0) {
            int $$3 = cov.a(cox.w, this);
            int $$4 = 0;

            for (int $$5 = 0; $$3 > 0 && $$5 < $$0; $$5++) {
               if (cor.a(this, $$3, $$1)) {
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

   public <T extends bkj> void a(int $$0, T $$1, Consumer<T> $$2) {
      if (!$$1.dL().B && (!($$1 instanceof ccx) || !((ccx)$$1).fT().d)) {
         if (this.i()) {
            if (this.a($$0, $$1.ef(), $$1 instanceof alr ? (alr)$$1 : null)) {
               $$2.accept($$1);
               cke $$3 = this.d();
               this.h(1);
               if ($$1 instanceof ccx) {
                  ((ccx)$$1).b(aqn.d.b($$3));
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

   public boolean a(chh $$0, cfx $$1, ccx $$2) {
      return this.d().a(this, $$0, $$1, $$2);
   }

   public boolean a(ckj $$0, chh $$1, cfx $$2, ccx $$3, blb $$4) {
      return this.d().a(this, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(bkj $$0, ccx $$1) {
      cke $$2 = this.d();
      if ($$2.a(this, $$0, $$1)) {
         $$1.b(aqn.c.b($$2));
      }
   }

   public void a(cqz $$0, dgb $$1, ht $$2, ccx $$3) {
      cke $$4 = this.d();
      if ($$4.a(this, $$0, $$1, $$2, $$3)) {
         $$3.b(aqn.c.b($$4));
      }
   }

   public boolean b(dgb $$0) {
      return this.d().a_($$0);
   }

   public bib a(ccx $$0, bkj $$1, bia $$2) {
      return this.d().a(this, $$0, $$1, $$2);
   }

   public ckj p() {
      if (this.b()) {
         return b;
      } else {
         ckj $$0 = new ckj(this.d(), this.s);
         $$0.e(this.K());
         if (this.v != null) {
            $$0.v = this.v.h();
         }

         return $$0;
      }
   }

   public ckj c(int $$0) {
      if (this.b()) {
         return b;
      } else {
         ckj $$1 = this.p();
         $$1.f($$0);
         return $$1;
      }
   }

   public static boolean a(ckj $$0, ckj $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return $$0.L() != $$1.L() ? false : c($$0, $$1);
      }
   }

   public static boolean b(ckj $$0, ckj $$1) {
      return $$0.a($$1.d());
   }

   public static boolean c(ckj $$0, ckj $$1) {
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

   public void a(cqz $$0, bjt $$1, int $$2, boolean $$3) {
      if (this.t > 0) {
         this.t--;
      }

      if (this.d() != null) {
         this.d().a(this, $$0, $$1, $$2, $$3);
      }
   }

   public void a(cqz $$0, ccx $$1, int $$2) {
      $$1.a(aqn.b.b(this.d()), $$2);
      this.d().b(this, $$0, $$1);
   }

   public int r() {
      return this.d().b(this);
   }

   public cmc s() {
      return this.d().c(this);
   }

   public void a(cqz $$0, bkj $$1, int $$2) {
      this.d().a(this, $$0, $$1, $$2);
   }

   public boolean t() {
      return this.d().l(this);
   }

   public boolean u() {
      return !this.b() && this.v != null && !this.v.g();
   }

   @Nullable
   public rt v() {
      return this.v;
   }

   public rt w() {
      if (this.v == null) {
         this.c(new rt());
      }

      return this.v;
   }

   public rt a(String $$0) {
      if (this.v != null && this.v.b($$0, 10)) {
         return this.v.p($$0);
      } else {
         rt $$1 = new rt();
         this.a($$0, $$1);
         return $$1;
      }
   }

   @Nullable
   public rt b(String $$0) {
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

   public rz x() {
      return this.v != null ? this.v.c("Enchantments", 10) : new rz();
   }

   public void c(@Nullable rt $$0) {
      this.v = $$0;
      if (this.d().o()) {
         this.b(this.k());
      }

      if ($$0 != null) {
         this.d().b($$0);
      }
   }

   public ui y() {
      rt $$0 = this.b("display");
      if ($$0 != null && $$0.b("Name", 8)) {
         try {
            ui $$1 = ui.a.a($$0.l("Name"));
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

   public ckj a(@Nullable ui $$0) {
      rt $$1 = this.a("display");
      if ($$0 != null) {
         $$1.a("Name", ui.a.a($$0));
      } else {
         $$1.r("Name");
      }

      return this;
   }

   public void z() {
      rt $$0 = this.b("display");
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
      rt $$0 = this.b("display");
      return $$0 != null && $$0.b("Name", 8);
   }

   public List<ui> a(@Nullable ccx $$0, cma $$1) {
      List<ui> $$2 = Lists.newArrayList();
      uw $$3 = ui.i().b(this.y()).a(this.C().e);
      if (this.A()) {
         $$3.a(n.u);
      }

      $$2.add($$3);
      if (!$$1.a() && !this.A() && this.a(ckm.rf)) {
         Integer $$4 = ckq.d(this);
         if ($$4 != null) {
            $$2.add(ckq.k(this));
         }
      }

      int $$5 = this.P();
      if (a($$5, ckj.a.f)) {
         this.d().a(this, $$0 == null ? null : $$0.dL(), $$2, $$1);
      }

      if (this.u()) {
         if (a($$5, ckj.a.h) && $$0 != null) {
            cml.a(this, $$0.dL().H_(), $$2);
         }

         if (a($$5, ckj.a.a)) {
            a($$2, this.x());
         }

         if (this.v.b("display", 10)) {
            rt $$6 = this.v.p("display");
            if (a($$5, ckj.a.g) && $$6.b("color", 99)) {
               if ($$1.a()) {
                  $$2.add(ui.a("item.color", String.format(Locale.ROOT, "#%06X", $$6.h("color"))).a(n.h));
               } else {
                  $$2.add(ui.c("item.dyed").a(n.h, n.u));
               }
            }

            if ($$6.d("Lore") == 9) {
               rz $$7 = $$6.c("Lore", 8);

               for (int $$8 = 0; $$8 < $$7.size(); $$8++) {
                  String $$9 = $$7.j($$8);

                  try {
                     uw $$10 = ui.a.a($$9);
                     if ($$10 != null) {
                        $$2.add(ul.a($$10, r));
                     }
                  } catch (Exception var19) {
                     $$6.r("Lore");
                  }
               }
            }
         }
      }

      if (a($$5, ckj.a.b)) {
         for (bjy $$12 : bjy.values()) {
            Multimap<blk, bln> $$13 = this.a($$12);
            if (!$$13.isEmpty()) {
               $$2.add(uh.a);
               $$2.add(ui.c("item.modifiers." + $$12.e()).a(n.h));

               for (Entry<blk, bln> $$14 : $$13.entries()) {
                  bln $$15 = $$14.getValue();
                  double $$16 = $$15.c();
                  boolean $$17 = false;
                  if ($$0 != null) {
                     if ($$15.a() == cke.m) {
                        $$16 += $$0.c(blp.c);
                        $$16 += (double)cov.a(this, bko.a);
                        $$17 = true;
                     } else if ($$15.a() == cke.n) {
                        $$16 += $$0.c(blp.e);
                        $$17 = true;
                     }
                  }

                  double $$18;
                  if ($$15.b() == bln.a.b || $$15.b() == bln.a.c) {
                     $$18 = $$16 * 100.0;
                  } else if ($$14.getKey().equals(blp.i)) {
                     $$18 = $$16 * 10.0;
                  } else {
                     $$18 = $$16;
                  }

                  if ($$17) {
                     $$2.add(uh.a().b(ui.a("attribute.modifier.equals." + $$15.b().a(), c.format($$18), ui.c($$14.getKey().c()))).a(n.c));
                  } else if ($$16 > 0.0) {
                     $$2.add(ui.a("attribute.modifier.plus." + $$15.b().a(), c.format($$18), ui.c($$14.getKey().c())).a(n.j));
                  } else if ($$16 < 0.0) {
                     $$18 *= -1.0;
                     $$2.add(ui.a("attribute.modifier.take." + $$15.b().a(), c.format($$18), ui.c($$14.getKey().c())).a(n.m));
                  }
               }
            }
         }
      }

      if (this.u()) {
         if (a($$5, ckj.a.c) && this.v.q("Unbreakable")) {
            $$2.add(ui.c("item.unbreakable").a(n.j));
         }

         if (a($$5, ckj.a.d) && this.v.b("CanDestroy", 9)) {
            rz $$21 = this.v.c("CanDestroy", 8);
            if (!$$21.isEmpty()) {
               $$2.add(uh.a);
               $$2.add(ui.c("item.canBreak").a(n.h));

               for (int $$22 = 0; $$22 < $$21.size(); $$22++) {
                  $$2.addAll(d($$21.j($$22)));
               }
            }
         }

         if (a($$5, ckj.a.e) && this.v.b("CanPlaceOn", 9)) {
            rz $$23 = this.v.c("CanPlaceOn", 8);
            if (!$$23.isEmpty()) {
               $$2.add(uh.a);
               $$2.add(ui.c("item.canPlace").a(n.h));

               for (int $$24 = 0; $$24 < $$23.size(); $$24++) {
                  $$2.addAll(d($$23.j($$24)));
               }
            }
         }
      }

      if ($$1.a()) {
         if (this.j()) {
            $$2.add(ui.a("item.durability", this.l() - this.k(), this.l()));
         }

         $$2.add(ui.b(jy.i.b(this.d()).toString()).a(n.i));
         if (this.u()) {
            $$2.add(ui.a("item.nbt_tags", this.v.e().size()).a(n.i));
         }
      }

      if ($$0 != null && !this.d().a($$0.dL().G())) {
         $$2.add(p);
      }

      return $$2;
   }

   private static boolean a(int $$0, ckj.a $$1) {
      return ($$0 & $$1.a()) == 0;
   }

   private int P() {
      return this.u() && this.v.b("HideFlags", 99) ? this.v.h("HideFlags") : 0;
   }

   public void a(ckj.a $$0) {
      rt $$1 = this.w();
      $$1.a("HideFlags", $$1.h("HideFlags") | $$0.a());
   }

   public static void a(List<ui> $$0, rz $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         rt $$3 = $$1.a($$2);
         jy.g.b(cov.b($$3)).ifPresent($$2x -> $$0.add($$2x.d(cov.a($$3))));
      }
   }

   private static Collection<ui> d(String $$0) {
      try {
         return (Collection<ui>)fk.b(jy.f.p(), $$0, true)
            .map(
               $$0x -> Lists.newArrayList(new ui[]{$$0x.a().b().f().a(n.i)}),
               $$0x -> $$0x.a().a().map($$0xx -> ((cua)$$0xx.a()).f().a(n.i)).collect(Collectors.toList())
            );
      } catch (CommandSyntaxException var2) {
         return Lists.newArrayList(new ui[]{ui.b("missingno").a(n.i)});
      }
   }

   public boolean B() {
      return this.d().i(this);
   }

   public cla C() {
      return this.d().n(this);
   }

   public boolean D() {
      return !this.d().d_(this) ? false : !this.E();
   }

   public void a(cot $$0, int $$1) {
      this.w();
      if (!this.v.b("Enchantments", 9)) {
         this.v.a("Enchantments", new rz());
      }

      rz $$2 = this.v.c("Enchantments", 10);
      $$2.add(cov.a(cov.a($$0), (byte)$$1));
   }

   public boolean E() {
      return this.v != null && this.v.b("Enchantments", 9) ? !this.v.c("Enchantments", 10).isEmpty() : false;
   }

   public void a(String $$0, sn $$1) {
      this.w().a($$0, $$1);
   }

   public boolean F() {
      return this.w instanceof bzj;
   }

   public void a(@Nullable bjt $$0) {
      this.w = $$0;
   }

   @Nullable
   public bzj G() {
      return this.w instanceof bzj ? (bzj)this.H() : null;
   }

   @Nullable
   public bjt H() {
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

   public Multimap<blk, bln> a(bjy $$0) {
      Multimap<blk, bln> $$1;
      if (this.u() && this.v.b("AttributeModifiers", 9)) {
         $$1 = HashMultimap.create();
         rz $$2 = this.v.c("AttributeModifiers", 10);

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            rt $$4 = $$2.a($$3);
            if (!$$4.b("Slot", 8) || $$4.l("Slot").equals($$0.e())) {
               Optional<blk> $$5 = jy.v.b(afw.a($$4.l("AttributeName")));
               if (!$$5.isEmpty()) {
                  bln $$6 = bln.a($$4);
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

   public void a(blk $$0, bln $$1, @Nullable bjy $$2) {
      this.w();
      if (!this.v.b("AttributeModifiers", 9)) {
         this.v.a("AttributeModifiers", new rz());
      }

      rz $$3 = this.v.c("AttributeModifiers", 10);
      rt $$4 = $$1.d();
      $$4.a("AttributeName", jy.v.b($$0).toString());
      if ($$2 != null) {
         $$4.a("Slot", $$2.e());
      }

      $$3.add($$4);
   }

   public ui J() {
      uw $$0 = ui.i().b(this.y());
      if (this.A()) {
         $$0.a(n.u);
      }

      uw $$1 = ul.a((ui)$$0);
      if (!this.b()) {
         $$1.a(this.C().e).a($$0x -> $$0x.a(new uo(uo.a.b, new uo.c(this))));
      }

      return $$1;
   }

   public boolean a(io<cua> $$0, dgf $$1) {
      if (this.y == null) {
         this.y = new chr("CanPlaceOn");
      }

      return this.y.a(this, $$0, $$1);
   }

   public boolean b(io<cua> $$0, dgf $$1) {
      if (this.x == null) {
         this.x = new chr("CanDestroy");
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

   public void b(cqz $$0, bkj $$1, int $$2) {
      this.d().a($$0, $$1, this, $$2);
   }

   public void a(bzq $$0) {
      this.d().a($$0);
   }

   public boolean M() {
      return this.d().u();
   }

   public aqc N() {
      return this.d().am_();
   }

   public aqc O() {
      return this.d().an_();
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
