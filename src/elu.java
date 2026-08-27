import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class elu extends elr {
   public static final Codec<elu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(avd.a(kj.F).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, elu::new)
   );
   private final avd<cqh> j;
   private final boolean k;

   private elu(avd<cqh> $$0, boolean $$1, int $$2, int $$3, List<env> $$4, List<emj> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public elq a() {
      return eln.f;
   }

   @Override
   public void a(Consumer<cqm> $$0, ekw $$1) {
      ki.h.c(this.j).forEach($$1x -> $$0.accept(new cqm($$1x)));
   }

   private boolean a(ekw $$0, Consumer<elo> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final il<cqh> $$2 : ki.h.c(this.j)) {
            $$1.accept(new elr.c() {
               @Override
               public void a(Consumer<cqm> $$0, ekw $$1) {
                  $$0.accept(new cqm($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(ekw $$0, Consumer<elo> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static elr.a<?> a(avd<cqh> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new elu($$0, false, $$1, $$2, $$3, $$4));
   }

   public static elr.a<?> b(avd<cqh> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new elu($$0, true, $$1, $$2, $$3, $$4));
   }
}
