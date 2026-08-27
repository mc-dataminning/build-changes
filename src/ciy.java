import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import java.util.EnumMap;
import java.util.List;
import java.util.UUID;

public class ciy extends clj implements ckp {
   private static final EnumMap<ciy.a, UUID> e = ac.a(new EnumMap<>(ciy.a.class), $$0 -> {
      $$0.put(ciy.a.d, UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"));
      $$0.put(ciy.a.c, UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"));
      $$0.put(ciy.a.b, UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"));
      $$0.put(ciy.a.a, UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150"));
   });
   public static final ji a = new jh() {
      @Override
      protected clo a(jf $$0, clo $$1) {
         return ciy.a($$0, $$1) ? $$1 : super.a($$0, $$1);
      }
   };
   protected final ciy.a b;
   private final int f;
   private final float g;
   protected final float c;
   protected final ciz d;
   private final Multimap<bmm, bmp> h;

   public static boolean a(jf $$0, clo $$1) {
      hx $$2 = $$0.c().a($$0.d().c(cxk.b));
      List<bll> $$3 = $$0.b().a(bll.class, new eju($$2), bky.f.and(new bky.a($$1)));
      if ($$3.isEmpty()) {
         return false;
      } else {
         bll $$4 = $$3.get(0);
         bla $$5 = bln.h($$1);
         clo $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof bln) {
            ((bln)$$4).a($$5, 2.0F);
            ((bln)$$4).fK();
         }

         return true;
      }
   }

   public ciy(ciz $$0, ciy.a $$1, clj.a $$2) {
      super($$2.b($$0.a($$1)));
      this.d = $$0;
      this.b = $$1;
      this.f = $$0.b($$1);
      this.g = $$0.f();
      this.c = $$0.g();
      cxk.a(this, a);
      Builder<bmm, bmp> $$3 = ImmutableMultimap.builder();
      UUID $$4 = e.get($$1);
      $$3.put(bmr.a, new bmp($$4, "Armor modifier", (double)this.f, bmp.a.a));
      $$3.put(bmr.b, new bmp($$4, "Armor toughness", (double)this.g, bmp.a.a));
      if ($$0 == cja.g) {
         $$3.put(bmr.i, new bmp($$4, "Armor knockback resistance", (double)this.c, bmp.a.a));
      }

      this.h = $$3.build();
   }

   public ciy.a b() {
      return this.b;
   }

   @Override
   public int c() {
      return this.d.a();
   }

   public ciz d() {
      return this.d;
   }

   @Override
   public boolean a(clo $$0, clo $$1) {
      return this.d.d().a($$1) || super.a($$0, $$1);
   }

   @Override
   public bjc<clo> a(csf $$0, cdz $$1, bja $$2) {
      return this.a(this, $$0, $$1, $$2);
   }

   @Override
   public Multimap<bmm, bmp> a(bla $$0) {
      return $$0 == this.b.a() ? this.h : super.a($$0);
   }

   public int e() {
      return this.f;
   }

   public float f() {
      return this.g;
   }

   @Override
   public bla g() {
      return this.b.a();
   }

   @Override
   public aqu at_() {
      return this.d().b();
   }

   public static enum a {
      a(bla.f, "helmet"),
      b(bla.e, "chestplate"),
      c(bla.d, "leggings"),
      d(bla.c, "boots");

      private final bla e;
      private final String f;

      private a(bla $$0, String $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public bla a() {
         return this.e;
      }

      public String b() {
         return this.f;
      }
   }
}
