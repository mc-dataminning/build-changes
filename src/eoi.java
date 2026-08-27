import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eoi extends eoo {
   public static final Codec<eoi> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(eqy.a.fieldOf("levels").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("treasure").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, eoi::new)
   );
   private final eqx b;
   private final boolean c;

   eoi(List<eqc> $$0, eqx $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public eoq b() {
      return eor.d;
   }

   @Override
   public Set<epl<?>> a() {
      return this.b.a();
   }

   @Override
   public crj a(crj $$0, enb $$1) {
      axr $$2 = $$1.b();
      return cwr.a($$2, $$0, this.b.a($$1), this.c);
   }

   public static eoi.a a(eqx $$0) {
      return new eoi.a($$0);
   }

   public static class a extends eoo.a<eoi.a> {
      private final eqx a;
      private boolean b;

      public a(eqx $$0) {
         this.a = $$0;
      }

      protected eoi.a a() {
         return this;
      }

      public eoi.a e() {
         this.b = true;
         return this;
      }

      @Override
      public eop b() {
         return new eoi(this.g(), this.a, this.b);
      }
   }
}
