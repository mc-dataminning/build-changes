import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import java.util.EnumMap;
import java.util.List;
import java.util.UUID;

public class cht extends cke implements cjk {
   private static final EnumMap<cht.a, UUID> e = ac.a(new EnumMap<>(cht.a.class), $$0 -> {
      $$0.put(cht.a.d, UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"));
      $$0.put(cht.a.c, UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"));
      $$0.put(cht.a.b, UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"));
      $$0.put(cht.a.a, UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150"));
   });
   public static final je a = new jd() {
      @Override
      protected ckj a(jb $$0, ckj $$1) {
         return cht.a($$0, $$1) ? $$1 : super.a($$0, $$1);
      }
   };
   protected final cht.a b;
   private final int f;
   private final float g;
   protected final float c;
   protected final chu d;
   private final Multimap<blk, bln> h;

   public static boolean a(jb $$0, ckj $$1) {
      ht $$2 = $$0.c().a($$0.d().c(cwd.b));
      List<bkj> $$3 = $$0.b().a(bkj.class, new eia($$2), bjw.f.and(new bjw.a($$1)));
      if ($$3.isEmpty()) {
         return false;
      } else {
         bkj $$4 = $$3.get(0);
         bjy $$5 = bkl.h($$1);
         ckj $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof bkl) {
            ((bkl)$$4).a($$5, 2.0F);
            ((bkl)$$4).fJ();
         }

         return true;
      }
   }

   public cht(chu $$0, cht.a $$1, cke.a $$2) {
      super($$2.b($$0.a($$1)));
      this.d = $$0;
      this.b = $$1;
      this.f = $$0.b($$1);
      this.g = $$0.f();
      this.c = $$0.g();
      cwd.a(this, a);
      Builder<blk, bln> $$3 = ImmutableMultimap.builder();
      UUID $$4 = e.get($$1);
      $$3.put(blp.a, new bln($$4, "Armor modifier", (double)this.f, bln.a.a));
      $$3.put(blp.b, new bln($$4, "Armor toughness", (double)this.g, bln.a.a));
      if ($$0 == chv.g) {
         $$3.put(blp.i, new bln($$4, "Armor knockback resistance", (double)this.c, bln.a.a));
      }

      this.h = $$3.build();
   }

   public cht.a b() {
      return this.b;
   }

   @Override
   public int c() {
      return this.d.a();
   }

   public chu d() {
      return this.d;
   }

   @Override
   public boolean a(ckj $$0, ckj $$1) {
      return this.d.d().a($$1) || super.a($$0, $$1);
   }

   @Override
   public bic<ckj> a(cqz $$0, ccx $$1, bia $$2) {
      return this.a(this, $$0, $$1, $$2);
   }

   @Override
   public Multimap<blk, bln> a(bjy $$0) {
      return $$0 == this.b.a() ? this.h : super.a($$0);
   }

   public int e() {
      return this.f;
   }

   public float f() {
      return this.g;
   }

   @Override
   public bjy g() {
      return this.b.a();
   }

   @Override
   public aqc ar_() {
      return this.d().b();
   }

   public static enum a {
      a(bjy.f, "helmet"),
      b(bjy.e, "chestplate"),
      c(bjy.d, "leggings"),
      d(bjy.c, "boots");

      private final bjy e;
      private final String f;

      private a(bjy $$0, String $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public bjy a() {
         return this.e;
      }

      public String b() {
         return this.f;
      }
   }
}
