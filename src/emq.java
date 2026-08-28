import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;

public class emq implements emr {
   public static final Codec<emq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eos.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               bty.b(0, 16).fieldOf("log_length").forGetter($$0x -> $$0x.c),
               epn.h.listOf().fieldOf("stump_decorators").forGetter($$0x -> $$0x.d),
               epn.h.listOf().fieldOf("log_decorators").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, emq::new)
   );
   public final eos b;
   public final bty c;
   public final List<epn> d;
   public final List<epn> e;

   protected emq(eos $$0, bty $$1, List<epn> $$2, List<epn> $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public static class a {
      private final eos a;
      private final bty b;
      private List<epn> c = new ArrayList<>();
      private List<epn> d = new ArrayList<>();

      public a(eos $$0, bty $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public emq.a a(List<epn> $$0) {
         this.c = $$0;
         return this;
      }

      public emq.a b(List<epn> $$0) {
         this.d = $$0;
         return this;
      }

      public emq a() {
         return new emq(this.a, this.b, this.c, this.d);
      }
   }
}
