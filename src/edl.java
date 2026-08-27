import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class edl extends eds {
   private static final Logger b = LogUtils.getLogger();
   private static final Codec<hi<cne>> c = jb.g.r().listOf().xmap(hi::a, $$0 -> $$0.a().toList());
   public static final Codec<edl> a = RecordCodecBuilder.create($$0 -> a($$0).and(aqy.a(c, "enchantments").forGetter($$0x -> $$0x.d)).apply($$0, edl::new));
   private final Optional<hi<cne>> d;

   edl(List<eff> $$0, Optional<hi<cne>> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   public edu b() {
      return edv.e;
   }

   @Override
   public cix a(cix $$0, ecg $$1) {
      aru $$2 = $$1.b();
      Optional<he<cne>> $$3 = this.d.<he<cne>>flatMap($$1x -> $$1x.a($$2)).or(() -> {
         boolean $$2x = $$0.a(cja.qb);
         List<he.c<cne>> $$3x = jb.g.h().filter($$0xx -> ((cne)$$0xx.a()).i()).filter($$2xx -> $$2x || ((cne)$$2xx.a()).a($$0)).toList();
         return ac.b($$3x, $$2);
      });
      if ($$3.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$3.get().a(), $$2);
      }
   }

   private static cix a(cix $$0, cne $$1, aru $$2) {
      int $$3 = arp.a($$2, $$1.e(), $$1.a());
      if ($$0.a(cja.qb)) {
         $$0 = new cix(cja.tC);
         cht.a($$0, new cnh($$1, $$3));
      } else {
         $$0.a($$1, $$3);
      }

      return $$0;
   }

   public static edl.a c() {
      return new edl.a();
   }

   public static eds.a<?> d() {
      return a($$0 -> new edl($$0, Optional.empty()));
   }

   public static class a extends eds.a<edl.a> {
      private final List<he<cne>> a = new ArrayList<>();

      protected edl.a a() {
         return this;
      }

      public edl.a a(cne $$0) {
         this.a.add($$0.j());
         return this;
      }

      @Override
      public edt b() {
         return new edl(this.g(), this.a.isEmpty() ? Optional.empty() : Optional.of(hi.a(this.a)));
      }
   }
}
