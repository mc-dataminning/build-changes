import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ema extends emg {
   public static final Codec<ema> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(eop.a.fieldOf("levels").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("treasure").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, ema::new)
   );
   private final eoo b;
   private final boolean c;

   ema(List<ent> $$0, eoo $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public emi b() {
      return emj.d;
   }

   @Override
   public Set<enc<?>> a() {
      return this.b.a();
   }

   @Override
   public cqk a(cqk $$0, eku $$1) {
      axd $$2 = $$1.b();
      return cuv.a($$2, $$0, this.b.a($$1), this.c);
   }

   public static ema.a a(eoo $$0) {
      return new ema.a($$0);
   }

   public static class a extends emg.a<ema.a> {
      private final eoo a;
      private boolean b;

      public a(eoo $$0) {
         this.a = $$0;
      }

      protected ema.a a() {
         return this;
      }

      public ema.a e() {
         this.b = true;
         return this;
      }

      @Override
      public emh b() {
         return new ema(this.g(), this.a, this.b);
      }
   }
}
