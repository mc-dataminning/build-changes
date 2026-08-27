import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class een extends eeu {
   private static final Logger b = LogUtils.getLogger();
   private static final Codec<ig<cot>> c = jy.g.r().listOf().xmap(ig::a, $$0 -> $$0.a().toList());
   public static final Codec<een> a = RecordCodecBuilder.create($$0 -> a($$0).and(asg.a(c, "enchantments").forGetter($$0x -> $$0x.d)).apply($$0, een::new));
   private final Optional<ig<cot>> d;

   een(List<egh> $$0, Optional<ig<cot>> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   public eew b() {
      return eex.e;
   }

   @Override
   public ckj a(ckj $$0, edi $$1) {
      ate $$2 = $$1.b();
      Optional<ib<cot>> $$3 = this.d.<ib<cot>>flatMap($$1x -> $$1x.a($$2)).or(() -> {
         boolean $$2x = $$0.a(ckm.qb);
         List<ib.c<cot>> $$3x = jy.g.h().filter($$0xx -> ((cot)$$0xx.a()).i()).filter($$2xx -> $$2x || ((cot)$$2xx.a()).a($$0)).toList();
         return ac.b($$3x, $$2);
      });
      if ($$3.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$3.get().a(), $$2);
      }
   }

   private static ckj a(ckj $$0, cot $$1, ate $$2) {
      int $$3 = asy.a($$2, $$1.e(), $$1.a());
      if ($$0.a(ckm.qb)) {
         $$0 = new ckj(ckm.tC);
         cjf.a($$0, new cow($$1, $$3));
      } else {
         $$0.a($$1, $$3);
      }

      return $$0;
   }

   public static een.a c() {
      return new een.a();
   }

   public static eeu.a<?> d() {
      return a($$0 -> new een($$0, Optional.empty()));
   }

   public static class a extends eeu.a<een.a> {
      private final List<ib<cot>> a = new ArrayList<>();

      protected een.a a() {
         return this;
      }

      public een.a a(cot $$0) {
         this.a.add($$0.j());
         return this;
      }

      @Override
      public eev b() {
         return new een(this.g(), this.a.isEmpty() ? Optional.empty() : Optional.of(ig.a(this.a)));
      }
   }
}
