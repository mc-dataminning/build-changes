import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class epb extends eox {
   public static final int a = 0;
   public static final Codec<epb> b = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(erh.a.fieldOf("count").forGetter($$0x -> $$0x.c), awu.a(Codec.INT, "limit", Integer.valueOf(0)).forGetter($$0x -> $$0x.d)))
            .apply($$0, epb::new)
   );
   private final erg c;
   private final int d;

   epb(List<eql> $$0, erg $$1, int $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public eoz b() {
      return epa.j;
   }

   @Override
   public Set<epu<?>> a() {
      return Sets.union(ImmutableSet.of(epx.d), this.c.a());
   }

   private boolean c() {
      return this.d > 0;
   }

   @Override
   public crs a(crs $$0, enk $$1) {
      bqa $$2 = $$1.c(epx.d);
      if ($$2 instanceof bqt) {
         int $$3 = cxa.h((bqt)$$2);
         if ($$3 == 0) {
            return $$0;
         }

         float $$4 = (float)$$3 * this.c.b($$1);
         $$0.f(Math.round($$4));
         if (this.c() && $$0.G() > this.d) {
            $$0.e(this.d);
         }
      }

      return $$0;
   }

   public static epb.a a(erg $$0) {
      return new epb.a($$0);
   }

   public static class a extends eox.a<epb.a> {
      private final erg a;
      private int b = 0;

      public a(erg $$0) {
         this.a = $$0;
      }

      protected epb.a a() {
         return this;
      }

      public epb.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      @Override
      public eoy b() {
         return new epb(this.g(), this.a, this.b);
      }
   }
}
