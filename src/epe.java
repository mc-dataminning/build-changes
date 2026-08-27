import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class epe extends eox {
   public static final Codec<epe> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(dmf.b.fieldOf("patterns").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.c)))
            .apply($$0, epe::new)
   );
   private final dmf b;
   private final boolean c;

   epe(List<eql> $$0, dmf $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected crs a(crs $$0, enk $$1) {
      if (this.c) {
         $$0.a(jr.N, dmf.a, this.b, ($$0x, $$1x) -> new dmf.a().a($$0x).a($$1x).a());
      } else {
         $$0.b(jr.N, this.b);
      }

      return $$0;
   }

   @Override
   public eoz b() {
      return epa.z;
   }

   public static epe.a a(boolean $$0) {
      return new epe.a($$0);
   }

   public static class a extends eox.a<epe.a> {
      private final dmf.a a = new dmf.a();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected epe.a a() {
         return this;
      }

      @Override
      public eoy b() {
         return new epe(this.g(), this.a.a(), this.b);
      }

      public epe.a a(in<dme> $$0, cql $$1) {
         this.a.a($$0, $$1);
         return this;
      }
   }
}
