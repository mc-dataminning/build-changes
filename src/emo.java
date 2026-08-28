import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;

public class emo implements emp {
   public static final Codec<emo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eoq.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               btw.b(0, 16).fieldOf("log_length").forGetter($$0x -> $$0x.c),
               epl.h.listOf().fieldOf("stump_decorators").forGetter($$0x -> $$0x.d),
               epl.h.listOf().fieldOf("log_decorators").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, emo::new)
   );
   public final eoq b;
   public final btw c;
   public final List<epl> d;
   public final List<epl> e;

   protected emo(eoq $$0, btw $$1, List<epl> $$2, List<epl> $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public static class a {
      private final eoq a;
      private final btw b;
      private List<epl> c = new ArrayList<>();
      private List<epl> d = new ArrayList<>();

      public a(eoq $$0, btw $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public emo.a a(List<epl> $$0) {
         this.c = $$0;
         return this;
      }

      public emo.a b(List<epl> $$0) {
         this.d = $$0;
         return this;
      }

      public emo a() {
         return new emo(this.a, this.b, this.c, this.d);
      }
   }
}
