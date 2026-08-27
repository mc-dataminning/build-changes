import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ak {
   private static final Logger a = LogUtils.getLogger();
   private final Map<ajt, ag> b = new Object2ObjectOpenHashMap();
   private final Set<ag> c = new ObjectLinkedOpenHashSet();
   private final Set<ag> d = new ObjectLinkedOpenHashSet();
   @Nullable
   private ak.a e;

   private void a(ag $$0) {
      for (ag $$1 : $$0.e()) {
         this.a($$1);
      }

      a.info("Forgot about advancement {}", $$0.b());
      this.b.remove($$0.b().a());
      if ($$0.c() == null) {
         this.c.remove($$0);
         if (this.e != null) {
            this.e.b($$0);
         }
      } else {
         this.d.remove($$0);
         if (this.e != null) {
            this.e.d($$0);
         }
      }
   }

   public void a(Set<ajt> $$0) {
      for (ajt $$1 : $$0) {
         ag $$2 = this.b.get($$1);
         if ($$2 == null) {
            a.warn("Told to remove advancement {} but I don't know what that is", $$1);
         } else {
            this.a($$2);
         }
      }
   }

   public void a(Collection<af> $$0) {
      List<af> $$1 = new ArrayList<>($$0);

      while (!$$1.isEmpty()) {
         if (!$$1.removeIf(this::b)) {
            a.error("Couldn't load advancements: {}", $$1);
            break;
         }
      }

      a.info("Loaded {} advancements", this.b.size());
   }

   private boolean b(af $$0) {
      Optional<ajt> $$1 = $$0.b().b();
      ag $$2 = $$1.map(this.b::get).orElse(null);
      if ($$2 == null && $$1.isPresent()) {
         return false;
      } else {
         ag $$3 = new ag($$0, $$2);
         if ($$2 != null) {
            $$2.b($$3);
         }

         this.b.put($$0.a(), $$3);
         if ($$2 == null) {
            this.c.add($$3);
            if (this.e != null) {
               this.e.a($$3);
            }
         } else {
            this.d.add($$3);
            if (this.e != null) {
               this.e.c($$3);
            }
         }

         return true;
      }
   }

   public void a() {
      this.b.clear();
      this.c.clear();
      this.d.clear();
      if (this.e != null) {
         this.e.a();
      }
   }

   public Iterable<ag> b() {
      return this.c;
   }

   public Collection<ag> c() {
      return this.b.values();
   }

   @Nullable
   public ag a(ajt $$0) {
      return this.b.get($$0);
   }

   @Nullable
   public ag a(af $$0) {
      return this.b.get($$0.a());
   }

   public void a(@Nullable ak.a $$0) {
      this.e = $$0;
      if ($$0 != null) {
         for (ag $$1 : this.c) {
            $$0.a($$1);
         }

         for (ag $$2 : this.d) {
            $$0.c($$2);
         }
      }
   }

   public interface a {
      void a(ag var1);

      void b(ag var1);

      void c(ag var1);

      void d(ag var1);

      void a();
   }
}
