import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class edo extends edl {
   public static final Codec<edo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aqi.a(je.D).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, edo::new)
   );
   private final aqi<cja> j;
   private final boolean k;

   private edo(aqi<cja> $$0, boolean $$1, int $$2, int $$3, List<efp> $$4, List<eed> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public edk a() {
      return edh.f;
   }

   @Override
   public void a(Consumer<cjf> $$0, ecq $$1) {
      jd.i.c(this.j).forEach($$1x -> $$0.accept(new cjf($$1x)));
   }

   private boolean a(ecq $$0, Consumer<edi> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final hg<cja> $$2 : jd.i.c(this.j)) {
            $$1.accept(new edl.c() {
               @Override
               public void a(Consumer<cjf> $$0, ecq $$1) {
                  $$0.accept(new cjf($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(ecq $$0, Consumer<edi> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static edl.a<?> a(aqi<cja> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new edo($$0, false, $$1, $$2, $$3, $$4));
   }

   public static edl.a<?> b(aqi<cja> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new edo($$0, true, $$1, $$2, $$3, $$4));
   }
}
