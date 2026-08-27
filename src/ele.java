import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ele extends elk {
   public static final Codec<ele> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(ent.a.fieldOf("levels").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("treasure").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, ele::new)
   );
   private final ens b;
   private final boolean c;

   ele(List<emx> $$0, ens $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public elm b() {
      return eln.d;
   }

   @Override
   public Set<emg<?>> a() {
      return this.b.a();
   }

   @Override
   public cpq a(cpq $$0, ejy $$1) {
      awt $$2 = $$1.b();
      return cua.a($$2, $$0, this.b.a($$1), this.c);
   }

   public static ele.a a(ens $$0) {
      return new ele.a($$0);
   }

   public static class a extends elk.a<ele.a> {
      private final ens a;
      private boolean b;

      public a(ens $$0) {
         this.a = $$0;
      }

      protected ele.a a() {
         return this;
      }

      public ele.a e() {
         this.b = true;
         return this;
      }

      @Override
      public ell b() {
         return new ele(this.g(), this.a, this.b);
      }
   }
}
