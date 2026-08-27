import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class egd extends egj {
   public static final Codec<egd> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(eis.a.fieldOf("levels").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("treasure").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, egd::new)
   );
   private final eir b;
   private final boolean c;

   egd(List<ehw> $$0, eir $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public egl b() {
      return egm.d;
   }

   @Override
   public Set<ehf<?>> a() {
      return this.b.a();
   }

   @Override
   public clj a(clj $$0, eex $$1) {
      ats $$2 = $$1.b();
      return cpw.a($$2, $$0, this.b.a($$1), this.c);
   }

   public static egd.a a(eir $$0) {
      return new egd.a($$0);
   }

   public static class a extends egj.a<egd.a> {
      private final eir a;
      private boolean b;

      public a(eir $$0) {
         this.a = $$0;
      }

      protected egd.a a() {
         return this;
      }

      public egd.a e() {
         this.b = true;
         return this;
      }

      @Override
      public egk b() {
         return new egd(this.g(), this.a, this.b);
      }
   }
}
