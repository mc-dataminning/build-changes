import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class esk extends esh {
   public static final Codec<esk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(awt.a(li.G).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, esk::new)
   );
   private final awt<cuc> j;
   private final boolean k;

   private esk(awt<cuc> $$0, boolean $$1, int $$2, int $$3, List<euu> $$4, List<etb> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public esg a() {
      return esd.f;
   }

   @Override
   public void a(Consumer<cuh> $$0, erp $$1) {
      lh.h.c(this.j).forEach($$1x -> $$0.accept(new cuh($$1x)));
   }

   private boolean a(erp $$0, Consumer<ese> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final ja<cuc> $$2 : lh.h.c(this.j)) {
            $$1.accept(new esh.c() {
               @Override
               public void a(Consumer<cuh> $$0, erp $$1) {
                  $$0.accept(new cuh($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(erp $$0, Consumer<ese> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static esh.a<?> a(awt<cuc> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new esk($$0, false, $$1, $$2, $$3, $$4));
   }

   public static esh.a<?> b(awt<cuc> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new esk($$0, true, $$1, $$2, $$3, $$4));
   }
}
