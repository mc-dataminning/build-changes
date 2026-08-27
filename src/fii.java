import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fii {
   private static final Logger a = LogUtils.getLogger();
   private final eql b;
   private final gdt c;
   private final af d = new af();
   private final Map<ae, ag> e = Maps.newHashMap();
   @Nullable
   private fii.a f;
   @Nullable
   private ae g;

   public fii(eql $$0, gdt $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(aap $$0) {
      if ($$0.f()) {
         this.d.a();
         this.e.clear();
      }

      this.d.a($$0.d());
      this.d.a($$0.a());

      for (Entry<aer, ag> $$1 : $$0.e().entrySet()) {
         ae $$2 = this.d.a($$1.getKey());
         if ($$2 != null) {
            ag $$3 = $$1.getValue();
            $$3.a($$2.h(), $$2.k());
            this.e.put($$2, $$3);
            if (this.f != null) {
               this.f.a($$2, $$3);
            }

            if (!$$0.f() && $$3.a()) {
               if (this.b.r != null) {
                  this.c.a(this.b.r, $$2);
               }

               if ($$2.d() != null && $$2.d().h()) {
                  this.b.ay().a(new euk($$2));
               }
            }
         } else {
            a.warn("Server informed client about progress for unknown advancement {}", $$1.getKey());
         }
      }
   }

   public af a() {
      return this.d;
   }

   public void a(@Nullable ae $$0, boolean $$1) {
      fio $$2 = this.b.J();
      if ($$2 != null && $$0 != null && $$1) {
         $$2.b(acf.a($$0));
      }

      if (this.g != $$0) {
         this.g = $$0;
         if (this.f != null) {
            this.f.e($$0);
         }
      }
   }

   public void a(@Nullable fii.a $$0) {
      this.f = $$0;
      this.d.a($$0);
      if ($$0 != null) {
         for (Entry<ae, ag> $$1 : this.e.entrySet()) {
            $$0.a($$1.getKey(), $$1.getValue());
         }

         $$0.e(this.g);
      }
   }

   public interface a extends af.a {
      void a(ae var1, ag var2);

      void e(@Nullable ae var1);
   }
}
