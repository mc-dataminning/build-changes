import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eto extends etl {
   public static final MapCodec<eto> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(axi.a(lv.K).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, eto::new)
   );
   private final axi<cvg> j;
   private final boolean k;

   private eto(axi<cvg> $$0, boolean $$1, int $$2, int $$3, List<ewe> $$4, List<euh> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public etk a() {
      return eth.f;
   }

   @Override
   public void a(Consumer<cvl> $$0, est $$1) {
      lu.g.b(this.j).forEach($$1x -> $$0.accept(new cvl($$1x)));
   }

   private boolean a(est $$0, Consumer<eti> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final jn<cvg> $$2 : lu.g.b(this.j)) {
            $$1.accept(new etl.c() {
               @Override
               public void a(Consumer<cvl> $$0, est $$1) {
                  $$0.accept(new cvl($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(est $$0, Consumer<eti> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static etl.a<?> a(axi<cvg> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eto($$0, false, $$1, $$2, $$3, $$4));
   }

   public static etl.a<?> b(axi<cvg> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eto($$0, true, $$1, $$2, $$3, $$4));
   }
}
