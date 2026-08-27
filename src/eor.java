import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eor extends eox {
   public static final Codec<eor> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(erh.a.fieldOf("levels").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("treasure").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, eor::new)
   );
   private final erg b;
   private final boolean c;

   eor(List<eql> $$0, erg $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public eoz b() {
      return epa.d;
   }

   @Override
   public Set<epu<?>> a() {
      return this.b.a();
   }

   @Override
   public crs a(crs $$0, enk $$1) {
      axt $$2 = $$1.b();
      return cxa.a($$2, $$0, this.b.a($$1), this.c);
   }

   public static eor.a a(erg $$0) {
      return new eor.a($$0);
   }

   public static class a extends eox.a<eor.a> {
      private final erg a;
      private boolean b;

      public a(erg $$0) {
         this.a = $$0;
      }

      protected eor.a a() {
         return this;
      }

      public eor.a e() {
         this.b = true;
         return this;
      }

      @Override
      public eoy b() {
         return new eor(this.g(), this.a, this.b);
      }
   }
}
