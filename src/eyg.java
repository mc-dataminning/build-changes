import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eyg extends eyd {
   public static final MapCodec<eyg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(axp.a(me.K).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, eyg::new)
   );
   private final axp<cxu> j;
   private final boolean k;

   private eyg(axp<cxu> $$0, boolean $$1, int $$2, int $$3, List<fau> $$4, List<eyz> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public eyc a() {
      return exz.f;
   }

   @Override
   public void a(Consumer<cxy> $$0, exl $$1) {
      md.g.c(this.j).forEach($$1x -> $$0.accept(new cxy($$1x)));
   }

   private boolean a(exl $$0, Consumer<eya> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final js<cxu> $$2 : md.g.c(this.j)) {
            $$1.accept(new eyd.c() {
               @Override
               public void a(Consumer<cxy> $$0, exl $$1) {
                  $$0.accept(new cxy($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(exl $$0, Consumer<eya> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static eyd.a<?> a(axp<cxu> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eyg($$0, false, $$1, $$2, $$3, $$4));
   }

   public static eyd.a<?> b(axp<cxu> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eyg($$0, true, $$1, $$2, $$3, $$4));
   }
}
