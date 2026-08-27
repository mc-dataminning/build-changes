import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import java.util.EnumMap;
import java.util.List;
import java.util.UUID;

public class ckh extends cms implements cly {
   private static final EnumMap<ckh.a, UUID> e = ac.a(new EnumMap<>(ckh.a.class), $$0 -> {
      $$0.put(ckh.a.d, UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"));
      $$0.put(ckh.a.c, UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"));
      $$0.put(ckh.a.b, UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"));
      $$0.put(ckh.a.a, UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150"));
   });
   public static final jj a = new ji() {
      @Override
      protected cmx a(jg $$0, cmx $$1) {
         return ckh.a($$0, $$1) ? $$1 : super.a($$0, $$1);
      }
   };
   protected final ckh.a b;
   private final int f;
   private final float g;
   protected final float c;
   protected final cki d;
   private final Multimap<bnl, bno> h;

   public static boolean a(jg $$0, cmx $$1) {
      hx $$2 = $$0.c().a($$0.d().c(cyu.b));
      List<bmk> $$3 = $$0.b().a(bmk.class, new eln($$2), blx.f.and(new blx.a($$1)));
      if ($$3.isEmpty()) {
         return false;
      } else {
         bmk $$4 = $$3.get(0);
         blz $$5 = bmm.h($$1);
         cmx $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof bmm) {
            ((bmm)$$4).a($$5, 2.0F);
            ((bmm)$$4).fJ();
         }

         return true;
      }
   }

   public ckh(cki $$0, ckh.a $$1, cms.a $$2) {
      super($$2.b($$0.a($$1)));
      this.d = $$0;
      this.b = $$1;
      this.f = $$0.b($$1);
      this.g = $$0.f();
      this.c = $$0.g();
      cyu.a(this, a);
      Builder<bnl, bno> $$3 = ImmutableMultimap.builder();
      UUID $$4 = e.get($$1);
      $$3.put(bnq.a, new bno($$4, "Armor modifier", (double)this.f, bno.a.a));
      $$3.put(bnq.b, new bno($$4, "Armor toughness", (double)this.g, bno.a.a));
      if ($$0 == ckj.g) {
         $$3.put(bnq.i, new bno($$4, "Armor knockback resistance", (double)this.c, bno.a.a));
      }

      this.h = $$3.build();
   }

   public ckh.a b() {
      return this.b;
   }

   @Override
   public int c() {
      return this.d.a();
   }

   public cki d() {
      return this.d;
   }

   @Override
   public boolean a(cmx $$0, cmx $$1) {
      return this.d.d().a($$1) || super.a($$0, $$1);
   }

   @Override
   public bkb<cmx> a(cto $$0, cfh $$1, bjz $$2) {
      return this.a(this, $$0, $$1, $$2);
   }

   @Override
   public Multimap<bnl, bno> a(blz $$0) {
      return $$0 == this.b.a() ? this.h : super.a($$0);
   }

   public int e() {
      return this.f;
   }

   public float f() {
      return this.g;
   }

   @Override
   public blz g() {
      return this.b.a();
   }

   @Override
   public arq as_() {
      return this.d().b();
   }

   public static enum a {
      a(blz.f, "helmet"),
      b(blz.e, "chestplate"),
      c(blz.d, "leggings"),
      d(blz.c, "boots");

      private final blz e;
      private final String f;

      private a(blz $$0, String $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public blz a() {
         return this.e;
      }

      public String b() {
         return this.f;
      }
   }
}
