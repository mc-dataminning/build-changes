import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class bkg {
   private final Map<bmm, bkb> a = Maps.newHashMap();
   private final bkh b;
   private final int c;
   @Nullable
   private String d;
   private Supplier<bki.a> e = () -> null;
   private final ig.c<bkg> f = kc.e.f(this);

   protected bkg(bkh $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public Optional<bki.a> b() {
      return Optional.ofNullable(this.e.get());
   }

   public void a(bll $$0, int $$1) {
   }

   public void a(@Nullable bkv $$0, @Nullable bkv $$1, bll $$2, int $$3, double $$4) {
      this.a($$2, $$3);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void b(bll $$0, int $$1) {
   }

   public boolean a() {
      return false;
   }

   protected String c() {
      if (this.d == null) {
         this.d = ac.a("effect", kc.e.b(this));
      }

      return this.d;
   }

   public String d() {
      return this.c();
   }

   public uv e() {
      return uv.c(this.d());
   }

   public bkh f() {
      return this.b;
   }

   public int g() {
      return this.c;
   }

   public bkg a(bmm $$0, String $$1, double $$2, bmp.a $$3) {
      this.a.put($$0, new bkg.a(UUID.fromString($$1), $$2, $$3));
      return this;
   }

   public bkg a(Supplier<bki.a> $$0) {
      this.e = $$0;
      return this;
   }

   public Map<bmm, bkb> h() {
      return this.a;
   }

   public void a(bmo $$0) {
      for (Entry<bmm, bkb> $$1 : this.a.entrySet()) {
         bmn $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.b($$1.getValue().a());
         }
      }
   }

   public void a(bmo $$0, int $$1) {
      for (Entry<bmm, bkb> $$2 : this.a.entrySet()) {
         bmn $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.b($$2.getValue().a());
            $$3.c($$2.getValue().a($$1));
         }
      }
   }

   public boolean i() {
      return this.b == bkh.a;
   }

   @Deprecated
   public ig.c<bkg> j() {
      return this.f;
   }

   class a implements bkb {
      private final UUID b;
      private final double c;
      private final bmp.a d;

      public a(UUID $$0, double $$1, bmp.a $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Override
      public UUID a() {
         return this.b;
      }

      @Override
      public bmp a(int $$0) {
         return new bmp(this.b, bkg.this.d() + " " + $$0, this.c * (double)($$0 + 1), this.d);
      }
   }
}
