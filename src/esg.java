import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class esg extends esd {
   public static final MapCodec<esg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(awt.a(lu.K).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, esg::new)
   );
   private final awt<cuj> j;
   private final boolean k;

   private esg(awt<cuj> $$0, boolean $$1, int $$2, int $$3, List<euw> $$4, List<esz> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public esc a() {
      return erz.f;
   }

   @Override
   public void a(Consumer<cuo> $$0, erl $$1) {
      lt.g.c(this.j).forEach($$1x -> $$0.accept(new cuo($$1x)));
   }

   private boolean a(erl $$0, Consumer<esa> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final jm<cuj> $$2 : lt.g.c(this.j)) {
            $$1.accept(new esd.c() {
               @Override
               public void a(Consumer<cuo> $$0, erl $$1) {
                  $$0.accept(new cuo($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(erl $$0, Consumer<esa> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static esd.a<?> a(awt<cuj> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new esg($$0, false, $$1, $$2, $$3, $$4));
   }

   public static esd.a<?> b(awt<cuj> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new esg($$0, true, $$1, $$2, $$3, $$4));
   }
}
