import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;

public class ena implements enb {
   public static final Codec<ena> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               epc.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               buh.b(0, 16).fieldOf("log_length").forGetter($$0x -> $$0x.c),
               epx.h.listOf().fieldOf("stump_decorators").forGetter($$0x -> $$0x.d),
               epx.h.listOf().fieldOf("log_decorators").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ena::new)
   );
   public final epc b;
   public final buh c;
   public final List<epx> d;
   public final List<epx> e;

   protected ena(epc $$0, buh $$1, List<epx> $$2, List<epx> $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public static class a {
      private final epc a;
      private final buh b;
      private List<epx> c = new ArrayList<>();
      private List<epx> d = new ArrayList<>();

      public a(epc $$0, buh $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public ena.a a(List<epx> $$0) {
         this.c = $$0;
         return this;
      }

      public ena.a b(List<epx> $$0) {
         this.d = $$0;
         return this;
      }

      public ena a() {
         return new ena(this.a, this.b, this.c, this.d);
      }
   }
}
