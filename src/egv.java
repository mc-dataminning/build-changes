import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class egv {
   private final ehb a;
   private final auu b;
   private final egz c;
   private final Set<egv.c<?>> d = Sets.newLinkedHashSet();

   egv(ehb $$0, auu $$1, egz $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(ejd<?> $$0) {
      return this.a.a($$0);
   }

   public <T> T b(ejd<T> $$0) {
      return this.a.b($$0);
   }

   public void a(ahg $$0, Consumer<cmx> $$1) {
      this.a.a($$0, $$1);
   }

   @Nullable
   public <T> T c(ejd<T> $$0) {
      return this.a.d($$0);
   }

   public boolean a(egv.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(egv.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(egv.c<?> $$0) {
      this.d.remove($$0);
   }

   public egz a() {
      return this.c;
   }

   public auu b() {
      return this.b;
   }

   public float c() {
      return this.a.b();
   }

   public and d() {
      return this.a.a();
   }

   public static egv.c<ehd> a(ehd $$0) {
      return new egv.c<>(eha.c, $$0);
   }

   public static egv.c<eju> a(eju $$0) {
      return new egv.c<>(eha.a, $$0);
   }

   public static egv.c<eii> a(eii $$0) {
      return new egv.c<>(eha.b, $$0);
   }

   public static class a {
      private final ehb a;
      @Nullable
      private auu b;

      public a(ehb $$0) {
         this.a = $$0;
      }

      public egv.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = auu.a($$0);
         }

         return this;
      }

      public and a() {
         return this.a.a();
      }

      public egv a(Optional<ahg> $$0) {
         and $$1 = this.a();
         MinecraftServer $$2 = $$1.o();
         auu $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::F_);
         return new egv(this.a, $$3, $$2.aJ());
      }
   }

   public static enum b implements avj {
      a("this", ejg.a),
      b("killer", ejg.d),
      c("direct_killer", ejg.e),
      d("killer_player", ejg.b);

      public static final avj.a<egv.b> e = avj.a(egv.b::values);
      private final String f;
      private final ejd<? extends blu> g;

      private b(String $$0, ejd<? extends blu> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public ejd<? extends blu> a() {
         return this.g;
      }

      public static egv.b a(String $$0) {
         egv.b $$1 = e.a($$0);
         if ($$1 != null) {
            return $$1;
         } else {
            throw new IllegalArgumentException("Invalid entity target " + $$0);
         }
      }

      @Override
      public String c() {
         return this.f;
      }
   }

   public static record c<T>(eha<T> a, T b) {
   }
}
