import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dda extends cvv {
   public static final MapCodec<dda> a = b(dda::new);
   public static final djr b = djq.E;
   private final bja c = bix.a(5);

   @Override
   public MapCodec<dda> a() {
      return a;
   }

   public dda(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(b);
   }

   @Override
   public void a(dja $$0, amz $$1, hx $$2, aup $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Nullable
   @Override
   public dgo a(hx $$0, dja $$1) {
      return new dht($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgo> dgp<T> a(cti $$0, dja $$1, dgq<T> $$2) {
      return $$0.B ? null : a($$2, dgq.K, dht::a);
   }

   @Override
   public dco b_(dja $$0) {
      return dco.c;
   }

   @Override
   public void a(dja $$0, amz $$1, hx $$2, cmr $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.c);
      }
   }
}
