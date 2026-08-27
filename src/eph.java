import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eph extends epo {
   public static final Codec<eph> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(esd.a.fieldOf("levels").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("treasure").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, eph::new)
   );
   private final esc b;
   private final boolean c;

   eph(List<erh> $$0, esc $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public epq b() {
      return epr.d;
   }

   @Override
   public Set<eqq<?>> a() {
      return this.b.a();
   }

   @Override
   public csd a(csd $$0, eoa $$1) {
      ayd $$2 = $$1.b();
      return cxo.a($$2, $$0, this.b.a($$1), this.c);
   }

   public static eph.a a(esc $$0) {
      return new eph.a($$0);
   }

   public static class a extends epo.a<eph.a> {
      private final esc a;
      private boolean b;

      public a(esc $$0) {
         this.a = $$0;
      }

      protected eph.a a() {
         return this;
      }

      public eph.a e() {
         this.b = true;
         return this;
      }

      @Override
      public epp b() {
         return new eph(this.g(), this.a, this.b);
      }
   }
}
