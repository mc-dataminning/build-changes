import com.mojang.jtracy.Plot;
import com.mojang.jtracy.TracyClient;
import com.mojang.jtracy.Zone;
import com.mojang.logging.LogUtils;
import java.lang.StackWalker.Option;
import java.lang.StackWalker.StackFrame;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Supplier;
import org.slf4j.Logger;

public class bpx implements bpt {
   private static final Logger a = LogUtils.getLogger();
   private static final StackWalker c = StackWalker.getInstance(Set.of(Option.RETAIN_CLASS_REFERENCE), 5);
   private final List<Zone> d = new ArrayList<>();
   private final Map<String, bpx.a> e = new HashMap<>();
   private final String f = Thread.currentThread().getName();

   @Override
   public void a() {
   }

   @Override
   public void b() {
      for (bpx.a $$0 : this.e.values()) {
         $$0.a(0);
      }
   }

   @Override
   public void a(String $$0) {
      String $$1 = "";
      String $$2 = "";
      int $$3 = 0;
      if (ab.aU) {
         Optional<StackFrame> $$4 = c.walk(
            $$0x -> $$0x.filter($$0xx -> $$0xx.getDeclaringClass() != bpx.class && $$0xx.getDeclaringClass() != bpt.a.class).findFirst()
         );
         if ($$4.isPresent()) {
            StackFrame $$5 = $$4.get();
            $$1 = $$5.getMethodName();
            $$2 = $$5.getFileName();
            $$3 = $$5.getLineNumber();
         }
      }

      Zone $$6 = TracyClient.beginZone($$0, $$1, $$2, $$3);
      this.d.add($$6);
   }

   @Override
   public void a(Supplier<String> $$0) {
      this.a($$0.get());
   }

   @Override
   public void c() {
      if (this.d.isEmpty()) {
         a.error("Tried to pop one too many times! Mismatched push() and pop()?");
      } else {
         Zone $$0 = this.d.removeLast();
         $$0.close();
      }
   }

   @Override
   public void b(String $$0) {
      this.c();
      this.a($$0);
   }

   @Override
   public void b(Supplier<String> $$0) {
      this.c();
      this.a($$0.get());
   }

   @Override
   public void a(brb $$0) {
   }

   @Override
   public void a(String $$0, int $$1) {
      this.e.computeIfAbsent($$0, $$1x -> new bpx.a(this.f + " " + $$0)).b($$1);
   }

   @Override
   public void a(Supplier<String> $$0, int $$1) {
      this.a($$0.get(), $$1);
   }

   private Zone d() {
      return this.d.getLast();
   }

   @Override
   public void e(String $$0) {
      this.d().addText($$0);
   }

   @Override
   public void a(long $$0) {
      this.d().addValue($$0);
   }

   @Override
   public void a(int $$0) {
      this.d().setColor($$0);
   }

   static final class a {
      private final Plot a;
      private int b;

      a(String $$0) {
         this.a = TracyClient.createPlot($$0);
         this.b = 0;
      }

      void a(int $$0) {
         this.b = $$0;
         this.a.setValue((double)$$0);
      }

      void b(int $$0) {
         this.a(this.b + $$0);
      }
   }
}
