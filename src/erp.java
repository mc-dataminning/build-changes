import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class erp extends erm {
   public static final MapCodec<erp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(awm.a(lr.K).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, erp::new)
   );
   private final awm<ctx> j;
   private final boolean k;

   private erp(awm<ctx> $$0, boolean $$1, int $$2, int $$3, List<euf> $$4, List<esi> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public erl a() {
      return eri.f;
   }

   @Override
   public void a(Consumer<cuc> $$0, equ $$1) {
      lq.g.c(this.j).forEach($$1x -> $$0.accept(new cuc($$1x)));
   }

   private boolean a(equ $$0, Consumer<erj> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final jj<ctx> $$2 : lq.g.c(this.j)) {
            $$1.accept(new erm.c() {
               @Override
               public void a(Consumer<cuc> $$0, equ $$1) {
                  $$0.accept(new cuc($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(equ $$0, Consumer<erj> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static erm.a<?> a(awm<ctx> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new erp($$0, false, $$1, $$2, $$3, $$4));
   }

   public static erm.a<?> b(awm<ctx> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new erp($$0, true, $$1, $$2, $$3, $$4));
   }
}
