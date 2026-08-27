import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ekl extends ekh {
   public static final int a = 0;
   public static final Codec<ekl> b = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(emq.a.fieldOf("count").forGetter($$0x -> $$0x.c), avp.a(Codec.INT, "limit", Integer.valueOf(0)).forGetter($$0x -> $$0x.d)))
            .apply($$0, ekl::new)
   );
   private final emp c;
   private final int d;

   ekl(List<elu> $$0, emp $$1, int $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public ekj b() {
      return ekk.i;
   }

   @Override
   public Set<eld<?>> a() {
      return Sets.union(ImmutableSet.of(elg.d), this.c.a());
   }

   private boolean c() {
      return this.d > 0;
   }

   @Override
   public coz a(coz $$0, eiv $$1) {
      bno $$2 = $$1.c(elg.d);
      if ($$2 instanceof bog) {
         int $$3 = ctj.h((bog)$$2);
         if ($$3 == 0) {
            return $$0;
         }

         float $$4 = (float)$$3 * this.c.b($$1);
         $$0.g(Math.round($$4));
         if (this.c() && $$0.M() > this.d) {
            $$0.f(this.d);
         }
      }

      return $$0;
   }

   public static ekl.a a(emp $$0) {
      return new ekl.a($$0);
   }

   public static class a extends ekh.a<ekl.a> {
      private final emp a;
      private int b = 0;

      public a(emp $$0) {
         this.a = $$0;
      }

      protected ekl.a a() {
         return this;
      }

      public ekl.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      @Override
      public eki b() {
         return new ekl(this.g(), this.a, this.b);
      }
   }
}
