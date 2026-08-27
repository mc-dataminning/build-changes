import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eeg extends eed {
   public static final Codec<eeg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(arh.a(jz.E).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, eeg::new)
   );
   private final arh<cke> j;
   private final boolean k;

   private eeg(arh<cke> $$0, boolean $$1, int $$2, int $$3, List<egh> $$4, List<eev> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public eec a() {
      return edz.f;
   }

   @Override
   public void a(Consumer<ckj> $$0, edi $$1) {
      jy.i.c(this.j).forEach($$1x -> $$0.accept(new ckj($$1x)));
   }

   private boolean a(edi $$0, Consumer<eea> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final ib<cke> $$2 : jy.i.c(this.j)) {
            $$1.accept(new eed.c() {
               @Override
               public void a(Consumer<ckj> $$0, edi $$1) {
                  $$0.accept(new ckj($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(edi $$0, Consumer<eea> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static eed.a<?> a(arh<cke> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eeg($$0, false, $$1, $$2, $$3, $$4));
   }

   public static eed.a<?> b(arh<cke> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eeg($$0, true, $$1, $$2, $$3, $$4));
   }
}
