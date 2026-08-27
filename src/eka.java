import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class eka {
   private final List<ConcurrentLinkedQueue<ejz>> a = ImmutableList.of(
      new ConcurrentLinkedQueue(), new ConcurrentLinkedQueue(), new ConcurrentLinkedQueue(), new ConcurrentLinkedQueue()
   );
   private volatile boolean b;
   private volatile int c;
   private volatile boolean d;
   private volatile int e;
   private volatile int f;

   public eka() {
      this.c = this.e = this.f + 1;
   }

   public boolean a() {
      return !this.b && this.c == this.e;
   }

   public boolean b() {
      if (this.b) {
         throw new RuntimeException("ALREADY RECORDING !!!");
      } else if (this.a()) {
         this.c = (this.e + 1) % this.a.size();
         this.b = true;
         return true;
      } else {
         return false;
      }
   }

   public void a(ejz $$0) {
      if (!this.b) {
         throw new RuntimeException("NOT RECORDING !!!");
      } else {
         ConcurrentLinkedQueue<ejz> $$1 = this.i();
         $$1.add($$0);
      }
   }

   public void c() {
      if (this.b) {
         this.b = false;
      } else {
         throw new RuntimeException("NOT RECORDING !!!");
      }
   }

   public boolean d() {
      return !this.d && this.c != this.e;
   }

   public boolean e() {
      if (this.d) {
         throw new RuntimeException("ALREADY PROCESSING !!!");
      } else if (this.d()) {
         this.d = true;
         return true;
      } else {
         return false;
      }
   }

   public void f() {
      if (!this.d) {
         throw new RuntimeException("NOT PROCESSING !!!");
      }
   }

   public void g() {
      if (this.d) {
         this.d = false;
         this.f = this.e;
         this.e = this.c;
      } else {
         throw new RuntimeException("NOT PROCESSING !!!");
      }
   }

   public ConcurrentLinkedQueue<ejz> h() {
      return this.a.get(this.f);
   }

   public ConcurrentLinkedQueue<ejz> i() {
      return this.a.get(this.c);
   }

   public ConcurrentLinkedQueue<ejz> j() {
      return this.a.get(this.e);
   }
}
