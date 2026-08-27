import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eqa extends epx {
   public static final MapCodec<eqa> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(awl.a(lf.G).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, eqa::new)
   );
   private final awl<ctj> j;
   private final boolean k;

   private eqa(awl<ctj> $$0, boolean $$1, int $$2, int $$3, List<esl> $$4, List<eqr> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public epw a() {
      return ept.f;
   }

   @Override
   public void a(Consumer<cto> $$0, epf $$1) {
      le.h.c(this.j).forEach($$1x -> $$0.accept(new cto($$1x)));
   }

   private boolean a(epf $$0, Consumer<epu> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final ix<ctj> $$2 : le.h.c(this.j)) {
            $$1.accept(new epx.c() {
               @Override
               public void a(Consumer<cto> $$0, epf $$1) {
                  $$0.accept(new cto($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(epf $$0, Consumer<epu> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static epx.a<?> a(awl<ctj> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eqa($$0, false, $$1, $$2, $$3, $$4));
   }

   public static epx.a<?> b(awl<ctj> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eqa($$0, true, $$1, $$2, $$3, $$4));
   }
}
