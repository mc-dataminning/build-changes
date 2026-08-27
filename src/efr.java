import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class efr extends efx {
   public static final Codec<efr> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(eig.a.fieldOf("levels").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("treasure").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, efr::new)
   );
   private final eif b;
   private final boolean c;

   efr(List<ehk> $$0, eif $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public efz b() {
      return ega.d;
   }

   @Override
   public Set<egt<?>> a() {
      return this.b.a();
   }

   @Override
   public clb a(clb $$0, eel $$1) {
      ato $$2 = $$1.b();
      return cpo.a($$2, $$0, this.b.a($$1), this.c);
   }

   public static efr.a a(eif $$0) {
      return new efr.a($$0);
   }

   public static class a extends efx.a<efr.a> {
      private final eif a;
      private boolean b;

      public a(eif $$0) {
         this.a = $$0;
      }

      protected efr.a a() {
         return this;
      }

      public efr.a e() {
         this.b = true;
         return this;
      }

      @Override
      public efy b() {
         return new efr(this.g(), this.a, this.b);
      }
   }
}
