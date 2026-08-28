import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public record dye(List<dye.b> d) implements ddp {
   static final Logger e = LogUtils.getLogger();
   public static final dye a = new dye(List.of());
   public static final Codec<dye> b = dye.b.a.listOf().xmap(dye::new, dye::b);
   public static final ze<wp, dye> c = dye.b.b.a(zc.a()).a(dye::new, dye::b);

   public dye a() {
      return new dye(List.copyOf(this.d.subList(0, this.d.size() - 1)));
   }

   @Override
   public void a(dag.b $$0, Consumer<xg> $$1, dbz $$2, kg $$3) {
      for (int $$4 = 0; $$4 < Math.min(this.b().size(), 6); $$4++) {
         $$1.accept(this.b().get($$4).a().a(o.h));
      }
   }

   public List<dye.b> b() {
      return this.d;
   }

   public static class a {
      private final Builder<dye.b> a = ImmutableList.builder();

      @Deprecated
      public dye.a a(jh<dyd> $$0, alq<dyd> $$1, czi $$2) {
         Optional<jg.c<dyd>> $$3 = $$0.a($$1);
         if ($$3.isEmpty()) {
            dye.e.warn("Unable to find banner pattern with id: '{}'", $$1.a());
            return this;
         } else {
            return this.a($$3.get(), $$2);
         }
      }

      public dye.a a(jg<dyd> $$0, czi $$1) {
         return this.a(new dye.b($$0, $$1));
      }

      public dye.a a(dye.b $$0) {
         this.a.add($$0);
         return this;
      }

      public dye.a a(dye $$0) {
         this.a.addAll($$0.d);
         return this;
      }

      public dye a() {
         return new dye(this.a.build());
      }
   }

   public static record b(jg<dyd> c, czi d) {
      public static final Codec<dye.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dyd.c.fieldOf("pattern").forGetter(dye.b::b), czi.q.fieldOf("color").forGetter(dye.b::c)).apply($$0, dye.b::new)
      );
      public static final ze<wp, dye.b> b = ze.a(dyd.d, dye.b::b, czi.r, dye.b::c, dye.b::new);

      public xu a() {
         String $$0 = this.c.a().b();
         return xg.c($$0 + "." + this.d.b());
      }

      public jg<dyd> b() {
         return this.c;
      }

      public czi c() {
         return this.d;
      }
   }
}
