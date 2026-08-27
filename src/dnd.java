import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public record dnd(List<dnd.b> d) {
   static final Logger e = LogUtils.getLogger();
   public static final dnd a = new dnd(List.of());
   public static final Codec<dnd> b = dnd.b.a.listOf().xmap(dnd::new, dnd::b);
   public static final ys<wf, dnd> c = dnd.b.b.a(yq.a()).a(dnd::new, dnd::b);

   public dnd a() {
      return new dnd(List.copyOf(this.d.subList(0, this.d.size() - 1)));
   }

   public List<dnd.b> b() {
      return this.d;
   }

   public static class a {
      private final Builder<dnd.b> a = ImmutableList.builder();

      @Deprecated
      public dnd.a a(ix<dnc> $$0, akg<dnc> $$1, crs $$2) {
         Optional<iw.c<dnc>> $$3 = $$0.a($$1);
         if ($$3.isEmpty()) {
            dnd.e.warn("Unable to find banner pattern with id: '{}'", $$1.a());
            return this;
         } else {
            return this.a($$3.get(), $$2);
         }
      }

      public dnd.a a(iw<dnc> $$0, crs $$1) {
         return this.a(new dnd.b($$0, $$1));
      }

      public dnd.a a(dnd.b $$0) {
         this.a.add($$0);
         return this;
      }

      public dnd.a a(dnd $$0) {
         this.a.addAll($$0.d);
         return this;
      }

      public dnd a() {
         return new dnd(this.a.build());
      }
   }

   public static record b(iw<dnc> c, crs d) {
      public static final Codec<dnd.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dnc.c.fieldOf("pattern").forGetter(dnd.b::b), crs.q.fieldOf("color").forGetter(dnd.b::c)).apply($$0, dnd.b::new)
      );
      public static final ys<wf, dnd.b> b = ys.a(dnc.d, dnd.b::b, crs.r, dnd.b::c, dnd.b::new);

      public xi a() {
         String $$0 = this.c.a().b();
         return wu.c($$0 + "." + this.d.b());
      }

      public iw<dnc> b() {
         return this.c;
      }

      public crs c() {
         return this.d;
      }
   }
}
