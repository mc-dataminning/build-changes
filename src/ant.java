import com.mojang.brigadier.exceptions.CommandSyntaxException;

@FunctionalInterface
public interface ant<T, R> {
   R apply(T var1) throws CommandSyntaxException;
}
