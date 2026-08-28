import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eug extends eud {
   public static final MapCodec<eug> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(axl.a(lw.K).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, eug::new)
   );
   private final axl<cvn> j;
   private final boolean k;

   private eug(axl<cvn> $$0, boolean $$1, int $$2, int $$3, List<eww> $$4, List<euz> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public euc a() {
      return etz.f;
   }

   @Override
   public void a(Consumer<cvs> $$0, etl $$1) {
      lv.g.c(this.j).forEach($$1x -> $$0.accept(new cvs($$1x)));
   }

   private boolean a(etl $$0, Consumer<eua> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final jo<cvn> $$2 : lv.g.c(this.j)) {
            $$1.accept(new eud.c() {
               @Override
               public void a(Consumer<cvs> $$0, etl $$1) {
                  $$0.accept(new cvs($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(etl $$0, Consumer<eua> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static eud.a<?> a(axl<cvn> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eug($$0, false, $$1, $$2, $$3, $$4));
   }

   public static eud.a<?> b(axl<cvn> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eug($$0, true, $$1, $$2, $$3, $$4));
   }
}
