import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class af {
   private static final Logger a = LogUtils.getLogger();
   private final Map<aep, ae> b = Maps.newHashMap();
   private final Set<ae> c = Sets.newLinkedHashSet();
   private final Set<ae> d = Sets.newLinkedHashSet();
   @Nullable
   private af.a e;

   private void a(ae $$0) {
      for (ae $$1 : $$0.g()) {
         this.a($$1);
      }

      a.info("Forgot about advancement {}", $$0.j());
      this.b.remove($$0.j());
      if ($$0.b() == null) {
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

   public void a(Set<aep> $$0) {
      for (aep $$1 : $$0) {
         ae $$2 = this.b.get($$1);
         if ($$2 == null) {
            a.warn("Told to remove advancement {} but I don't know what that is", $$1);
         } else {
            this.a($$2);
         }
      }
   }

   public void a(Map<aep, ae.a> $$0) {
      Map<aep, ae.a> $$1 = Maps.newHashMap($$0);

      while (!$$1.isEmpty()) {
         boolean $$2 = false;
         Iterator<Entry<aep, ae.a>> $$3 = $$1.entrySet().iterator();

         while ($$3.hasNext()) {
            Entry<aep, ae.a> $$4 = $$3.next();
            aep $$5 = $$4.getKey();
            ae.a $$6 = $$4.getValue();
            if ($$6.a(this.b::get)) {
               ae $$7 = $$6.b($$5);
               this.b.put($$5, $$7);
               $$2 = true;
               $$3.remove();
               if ($$7.b() == null) {
                  this.c.add($$7);
                  if (this.e != null) {
                     this.e.a($$7);
                  }
               } else {
                  this.d.add($$7);
                  if (this.e != null) {
                     this.e.c($$7);
                  }
               }
            }
         }

         if (!$$2) {
            for (Entry<aep, ae.a> $$8 : $$1.entrySet()) {
               a.error("Couldn't load advancement {}: {}", $$8.getKey(), $$8.getValue());
            }
            break;
         }
      }

      a.info("Loaded {} advancements", this.b.size());
   }

   public void a() {
      this.b.clear();
      this.c.clear();
      this.d.clear();
      if (this.e != null) {
         this.e.a();
      }
   }

   public Iterable<ae> b() {
      return this.c;
   }

   public Collection<ae> c() {
      return this.b.values();
   }

   @Nullable
   public ae a(aep $$0) {
      return this.b.get($$0);
   }

   public void a(@Nullable af.a $$0) {
      this.e = $$0;
      if ($$0 != null) {
         for (ae $$1 : this.c) {
            $$0.a($$1);
         }

         for (ae $$2 : this.d) {
            $$0.c($$2);
         }
      }
   }

   public interface a {
      void a(ae var1);

      void b(ae var1);

      void c(ae var1);

      void d(ae var1);

      void a();
   }
}
