import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dnq<T extends dng> implements dnp<T> {
   private final dni<T> a;
   private final dnl<T> b;

   public dnq(dni<T> $$0, dnl<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Nullable
   @Override
   public T a(int $$0) {
      return this.a.a($$0);
   }

   @Nullable
   @Override
   public T a(UUID $$0) {
      return this.a.a($$0);
   }

   @Override
   public Iterable<T> a() {
      return this.a.a();
   }

   @Override
   public <U extends T> void a(dnn<T, U> $$0, atd<U> $$1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.util.ConcurrentModificationException
      //   at java.base/java.util.ArrayList$ArrayListSpliterator.tryAdvance(ArrayList.java:1695)
      //   at java.base/java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:147)
      //   at java.base/java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:588)
      //   at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:574)
      //   at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
      //   at java.base/java.util.stream.MatchOps$MatchOp.evaluateSequential(MatchOps.java:230)
      //   at java.base/java.util.stream.MatchOps$MatchOp.evaluateSequential(MatchOps.java:196)
      //   at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
      //   at java.base/java.util.stream.ReferencePipeline.allMatch(ReferencePipeline.java:673)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.isMappingInBounds(InvocationExprent.java:1648)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.putGenericMapping(InvocationExprent.java:1548)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.processGenericMapping(InvocationExprent.java:1520)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.lambda$getInferredExprType$14(InvocationExprent.java:553)
      //
      // Bytecode:
      // 0: aload 0
      // 1: getfield dnq.a Ldni;
      // 4: aload 1
      // 5: aload 2
      // 6: invokevirtual dni.a (Ldnn;Latd;)V
      // 9: return
   }

   @Override
   public void a(elx $$0, Consumer<T> $$1) {
      this.b.b($$0, atd.forConsumer($$1));
   }

   @Override
   public <U extends T> void a(dnn<T, U> $$0, elx $$1, atd<U> $$2) {
      this.b.a($$0, $$1, $$2);
   }
}
