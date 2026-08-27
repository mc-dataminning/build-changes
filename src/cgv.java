import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import java.util.EnumMap;
import java.util.List;
import java.util.UUID;

public class cgv extends cjg implements cim {
   private static final EnumMap<cgv.a, UUID> e = ac.a(new EnumMap<>(cgv.a.class), $$0 -> {
      $$0.put(cgv.a.d, UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"));
      $$0.put(cgv.a.c, UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"));
      $$0.put(cgv.a.b, UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"));
      $$0.put(cgv.a.a, UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150"));
   });
   public static final ih a = new ig() {
      @Override
      protected cjl a(id $$0, cjl $$1) {
         return cgv.a($$0, $$1) ? $$1 : super.a($$0, $$1);
      }
   };
   protected final cgv.a b;
   private final int f;
   private final float g;
   protected final float c;
   protected final cgw d;
   private final Multimap<bkn, bkq> h;

   public static boolean a(id $$0, cjl $$1) {
      gw $$2 = $$0.c().a($$0.d().c(cvf.b));
      List<bjm> $$3 = $$0.b().a(bjm.class, new ehc($$2), biz.f.and(new biz.a($$1)));
      if ($$3.isEmpty()) {
         return false;
      } else {
         bjm $$4 = $$3.get(0);
         bjb $$5 = bjo.h($$1);
         cjl $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof bjo) {
            ((bjo)$$4).a($$5, 2.0F);
            ((bjo)$$4).fJ();
         }

         return true;
      }
   }

   public cgv(cgw $$0, cgv.a $$1, cjg.a $$2) {
      super($$2.b($$0.a($$1)));
      this.d = $$0;
      this.b = $$1;
      this.f = $$0.b($$1);
      this.g = $$0.f();
      this.c = $$0.g();
      cvf.a(this, a);
      Builder<bkn, bkq> $$3 = ImmutableMultimap.builder();
      UUID $$4 = e.get($$1);
      $$3.put(bks.a, new bkq($$4, "Armor modifier", (double)this.f, bkq.a.a));
      $$3.put(bks.b, new bkq($$4, "Armor toughness", (double)this.g, bkq.a.a));
      if ($$0 == cgx.g) {
         $$3.put(bks.i, new bkq($$4, "Armor knockback resistance", (double)this.c, bkq.a.a));
      }

      this.h = $$3.build();
   }

   public cgv.a b() {
      return this.b;
   }

   @Override
   public int c() {
      return this.d.a();
   }

   public cgw d() {
      return this.d;
   }

   @Override
   public boolean a(cjl $$0, cjl $$1) {
      return this.d.d().a($$1) || super.a($$0, $$1);
   }

   @Override
   public bhf<cjl> a(cqb $$0, cca $$1, bhd $$2) {
      return this.a(this, $$0, $$1, $$2);
   }

   @Override
   public Multimap<bkn, bkq> a(bjb $$0) {
      return $$0 == this.b.a() ? this.h : super.a($$0);
   }

   public int e() {
      return this.f;
   }

   public float f() {
      return this.g;
   }

   @Override
   public bjb g() {
      return this.b.a();
   }

   @Override
   public apf ao_() {
      return this.d().b();
   }

   public static enum a {
      a(bjb.f, "helmet"),
      b(bjb.e, "chestplate"),
      c(bjb.d, "leggings"),
      d(bjb.c, "boots");

      private final bjb e;
      private final String f;

      private a(bjb $$0, String $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public bjb a() {
         return this.e;
      }

      public String b() {
         return this.f;
      }
   }
}
