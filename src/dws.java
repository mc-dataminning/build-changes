import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class dws extends dwv {
   public static final Codec<dws> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dws::new));

   public dws(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dww<?> a() {
      return dww.c;
   }

   @Override
   public List<dvd.a> a(cto $$0, BiConsumer<hx, dja> $$1, aup $$2, int $$3, hx $$4, dun $$5) {
      hx $$6 = $$4.d();
      a($$0, $$1, $$2, $$6, $$5);
      a($$0, $$1, $$2, $$6.h(), $$5);
      a($$0, $$1, $$2, $$6.f(), $$5);
      a($$0, $$1, $$2, $$6.f().h(), $$5);
      hx.a $$7 = new hx.a();

      for (int $$8 = 0; $$8 < $$3; $$8++) {
         this.a($$0, $$1, $$2, $$7, $$5, $$4, 0, $$8, 0);
         if ($$8 < $$3 - 1) {
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 1, $$8, 0);
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 1, $$8, 1);
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 0, $$8, 1);
         }
      }

      return ImmutableList.of(new dvd.a($$4.b($$3), 0, true));
   }

   private void a(cto $$0, BiConsumer<hx, dja> $$1, aup $$2, hx.a $$3, dun $$4, hx $$5, int $$6, int $$7, int $$8) {
      $$3.a($$5, $$6, $$7, $$8);
      this.a($$0, $$1, $$2, $$3, $$4);
   }
}
